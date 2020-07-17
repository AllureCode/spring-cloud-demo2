package com.gnaw.springcloud.service.impl;

import com.gnaw.springcloud.entity.Payment;
import com.gnaw.springcloud.mapper.PaymentMapper;
import com.gnaw.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: spring-cloud2020
 * @description: service实现类
 * @author: wang_sir
 * @create: 2020-06-25 21:34
 **/
@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentMapper paymentMapper;
    @Override
    public int create(Payment payment) {
        return paymentMapper.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentMapper.getPaymentById(id);
    }
}
