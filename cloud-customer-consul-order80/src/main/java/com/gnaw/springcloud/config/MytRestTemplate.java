package com.gnaw.springcloud.config;


import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @program: spring-cloud2020
 * @description:
 * @author: wang_sir
 * @create: 2020-06-30 15:50
 **/
@Configuration
public class MytRestTemplate {

    @Bean
    @LoadBalanced
    public RestTemplate getMytRestTemplate(){
        return  new RestTemplate();
    }
}
