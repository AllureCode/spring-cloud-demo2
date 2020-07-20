package com.gnaw.springcloud.controller;

import com.gnaw.springcloud.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: spring-cloud2020
 * @description:
 * @author: wang_sir
 * @create: 2020-07-19 22:39
 **/
@RestController
public class ConsumerHystrixController {
    @Autowired
    private ConsumerService consumerService;

    @GetMapping("/consumer/payment/hystrix/ok/{id}")
    public String paymentInfo_Ok(@PathVariable("id") Integer id){
       return consumerService.paymentInfo_Ok(id);
    }

    @GetMapping("/consumer//payment/hystrix/timeout/{id}")
    public String paymentInfo_TimeOut(@PathVariable("id") Integer id){
        return consumerService.paymentInfo_TimeOut(id);
    }


}
