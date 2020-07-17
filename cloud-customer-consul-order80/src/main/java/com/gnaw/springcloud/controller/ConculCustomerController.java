package com.gnaw.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @program: spring-cloud2020
 * @description:
 * @author: wang_sir
 * @create: 2020-07-04 15:56
 **/
@RestController
public class ConculCustomerController {

    public static final String INVOKER_URL="http://consul-provider-payment";
    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/customer/payment/consul")
    public String getTest(){

        return restTemplate.getForObject(INVOKER_URL + "/payment/consul", String.class);

    }
}
