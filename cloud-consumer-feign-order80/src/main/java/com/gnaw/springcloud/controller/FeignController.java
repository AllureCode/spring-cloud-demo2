package com.gnaw.springcloud.controller;

import com.gnaw.springcloud.entity.CommentResult;
import com.gnaw.springcloud.entity.Payment;
import com.gnaw.springcloud.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: spring-cloud2020
 * @description:
 * @author: wang_sir
 * @create: 2020-07-15 16:51
 **/
@RestController
public class FeignController {

    @Autowired
    private FeignService feignService;

    @GetMapping("/consumer/payment/get/{id}")
    public CommentResult<Payment> getPaymentById(@PathVariable("id") Long id) {
        return feignService.getPaymentById(id);
    }
}
