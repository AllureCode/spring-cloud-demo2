package com.gnaw.springcloud.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
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
    @HystrixCommand(fallbackMethod = "paymentInfo_TimeOutHandler",
    commandProperties = {@HystrixProperty(name = "execution.isolation." +
            "thread.timeoutInMilliseconds",value = "3000")})
    public String paymentInfo_TimeOut(Integer id){

        try {
            //线程沉睡3秒
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "线程池："+Thread.currentThread().getName()+"payment_fail" +
                ",id "+id+"\t"+"fail";
    }

    /**
     * 出错回调的方法
     */
    public String paymentInfo_TimeOutHandler(Integer id){
        return "线程池："+Thread.currentThread().getName()+"paymentInfo_TimeOutHandler" +
                ",id "+id+"\t"+"paymentInfo_TimeOutHandler 出错了";
    }
}
