package com.gnaw.springcloud.controller;

import com.gnaw.springcloud.service.ConsumerService;
import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.netflix.hystrix.contrib.javanica.conf.HystrixPropertiesManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * @program: spring-cloud2020
 * @description:
 * @author: wang_sir
 * @create: 2020-07-19 22:39
 **/
@RestController
public class ConsumerHystrixController {
    @Autowired
    private ConsumerService consumerService;

    @GetMapping("/consumer/payment/hystrix/ok/{id}")
    public String paymentInfo_Ok(@PathVariable("id") Integer id){
       return consumerService.paymentInfo_Ok(id);
    }

    /**添加hystrix服务降级
    */
//    @HystrixCommand(fallbackMethod = "paymentInfo_circuitBreaker",
////            commandProperties = {@HystrixProperty(name = "execution.isolation." +
////                    "thread.timeoutInMilliseconds",value = "3000")})
//            commandProperties = {@HystrixProperty(name =
//                    HystrixPropertiesManager.EXECUTION_ISOLATION_THREAD_TIMEOUT_IN_MILLISECONDS
//    ,value = "3000")})
    @GetMapping("/consumer/payment/hystrix/timeout/{id}")
    public String paymentInfo_TimeOut(@PathVariable("id") Integer id){
        try {
            //线程沉睡5秒
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return consumerService.paymentInfo_TimeOut(id);
    }

    /**
     * 这样写代码耦合度过高
     * 出错回调得方法
     * @param id
     * @return
     */
//    public String paymentInfo_circuitBreaker(Integer id){
//        return Thread.currentThread().getName()+"\t"+"断路器 服务器出错"+id;
//    }
}
