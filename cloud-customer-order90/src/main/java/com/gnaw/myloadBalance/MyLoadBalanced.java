package com.gnaw.myloadBalance;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @program: spring-cloud2020
 * @description: 自定义rabbon的负载均衡
 * @author: wang_sir
 * @create: 2020-07-05 20:13
 **/
@Configuration
public class MyLoadBalanced {

    @Bean
    public IRule myIRule(){
        return new RandomRule();
    }
}
