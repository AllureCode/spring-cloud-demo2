package com.gnaw.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @program: spring-cloud2020
 * @description:
 * @author: wang_sir
 * @create: 2020-06-29 16:14
 **/
@RestController
public class PaymentController {

    @Value("${server.port}")
    private String servicePort;

    @GetMapping("/payment/zk")
    public String paymentzk(){
        return "springcloud with zookeeper:"+servicePort+"\t"+ UUID.randomUUID().toString();
    }
}
