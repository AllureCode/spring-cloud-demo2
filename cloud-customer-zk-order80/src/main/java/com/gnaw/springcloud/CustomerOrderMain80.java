package com.gnaw.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @program: spring-cloud2020
 * @description:
 * @author: wang_sir
 * @create: 2020-06-30 15:49
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class CustomerOrderMain80 {
    public static void main(String[] args) {
        SpringApplication.run(CustomerOrderMain80.class, args);
    }
}
