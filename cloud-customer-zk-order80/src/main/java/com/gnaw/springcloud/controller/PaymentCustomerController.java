package com.gnaw.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @program: spring-cloud2020
 * @description:
 * @author: wang_sir
 * @create: 2020-06-30 15:51
 **/
@RestController
public class PaymentCustomerController {

    public static final String INVOKER_URL="http://cloud-payment-service";

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/customer/payment/zk")
    public String getTest(){

        String forObject = restTemplate.getForObject(INVOKER_URL + "/payment/zk", String.class);
        return forObject;
    }
}
