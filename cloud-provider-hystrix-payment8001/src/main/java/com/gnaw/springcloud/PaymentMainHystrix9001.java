package com.gnaw.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @program: spring-cloud2020
 * @description:
 * @author: wang_sir
 * @create: 2020-07-19 17:49
 **/

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@EnableCircuitBreaker
@EnableEurekaClient
public class PaymentMainHystrix9001 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMainHystrix9001.class,args);
    }
}
