package com.gnaw.springcloud.mapper;

import com.gnaw.springcloud.entity.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author wang_sir
 */
@Mapper
public interface PaymentMapper {
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
    Payment getPaymentById(@Param("id") Long id);
}
