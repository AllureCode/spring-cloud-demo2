package com.gnaw.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @program: spring-cloud2020
 * @description: 解决hystrix在每个方法前面都要加一个出错得回调方法
 * 因此我们重写一个ConsumerFallbackServiceImpl实现ConsumerService接口
 * 为每个接口方法实现出错后回调得方法 降级代码耦合度
 * @author: wang_sir
 * @create: 2020-07-21 15:53
 **/
@Component
public class ConsumerFallbackServiceImpl implements ConsumerService {
    @Override
    public String paymentInfo_Ok(Integer id) {
        return "paymentInfo_Ok出错回调得方法";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "paymentInfo_TimeOut出错回调得方法";
    }
}
