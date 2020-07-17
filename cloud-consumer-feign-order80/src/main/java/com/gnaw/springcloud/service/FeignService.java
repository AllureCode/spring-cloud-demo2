package com.gnaw.springcloud.service;

import com.gnaw.springcloud.entity.CommentResult;
import com.gnaw.springcloud.entity.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @program: spring-cloud2020
 * @description:
 * @author: wang_sir
 * @create: 2020-07-15 16:50
 **/
@Component
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")
public interface FeignService {

    @GetMapping("/payment/get/{id}")
    CommentResult<Payment>  getPaymentById(@PathVariable("id") Long id);
}
