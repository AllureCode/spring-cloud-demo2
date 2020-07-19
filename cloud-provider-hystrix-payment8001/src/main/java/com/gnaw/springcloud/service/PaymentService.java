package com.gnaw.springcloud.service;

import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @program: spring-cloud2020
 * @description:
 * @author: wang_sir
 * @create: 2020-07-19 17:53
 **/
@Service
public class PaymentService {

    /**
     * 正常访问
     * @param id
     * @return
     */
    public String paymentInfo_Ok(Integer id){
        return "线程池："+Thread.currentThread().getName()+"payment_ok" +
                ",id "+id+"\t"+"ok";
    }
    /**
     * 可能出错
     * @param id
     * @return
     */
    public String paymentInfo_TimeOut(Integer id){

        try {
            //线程沉睡3秒
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "线程池："+Thread.currentThread().getName()+"payment_fail" +
                ",id "+id+"\t"+"fail";
    }


}
