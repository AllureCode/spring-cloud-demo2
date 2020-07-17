package com.gnaw.springcloud.controller;

import com.gnaw.springcloud.entity.CommentResult;
import com.gnaw.springcloud.entity.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


/**
 * @program: spring-cloud2020
 * @description:
 * @author: wang_sir
 * @create: 2020-06-26 13:04
 **/
@RestController
@Slf4j
public class PaymentCustomerController {

    @Autowired
    private RestTemplate restTemplate;
    // 单机版   public static final String  GET_URL="http://localhost:9001";
    //集群版
    public static final String GET_URL = "http://CLOUD-PAYMENT-SERVICE";

    @GetMapping("/customer/payment/create")
    public CommentResult<Payment> create(Payment payment) {
        log.info("开始执行此方法");
        return restTemplate.postForObject(GET_URL + "/payment/create", payment, CommentResult.class);
    }

    @GetMapping("/customer/payment/get/{id}")
    public CommentResult<Payment> getPaymentById(@PathVariable("id") Long id) {

        return restTemplate.getForObject(GET_URL + "/payment/get/" + id, CommentResult.class);
    }


}
