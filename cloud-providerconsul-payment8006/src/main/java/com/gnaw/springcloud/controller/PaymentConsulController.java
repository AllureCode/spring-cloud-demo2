package com.gnaw.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @program: spring-cloud2020
 * @description:
 * @author: wang_sir
 * @create: 2020-07-04 15:26
 **/
@RestController
public class PaymentConsulController {

    @Value("${server.port}")
    private String port;

    @GetMapping("/payment/consul")
    public String getPaymentPort(){
        return "springcloud with consul:"+port+"\t"+ UUID.randomUUID().toString();
    }
}
