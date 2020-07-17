package com.gnaw.springcloud.service;

import com.gnaw.springcloud.entity.Payment;

/**
 * @author wang-sir
 * @date 2020-6-25 21:32
 */
public interface PaymentService {
    /**
     * 插入数据
     * @param payment
     * @return
     */
    int create(Payment payment);

    /**
     *根据查询数据
     * @param id
     * @return
     */
    Payment getPaymentById(Long id);
}
