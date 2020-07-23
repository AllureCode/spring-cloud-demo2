package com.gnaw.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @program: spring-cloud2020
 * @description:
 * @author: wang_sir
 * @create: 2020-07-23 09:46
 **/
@SpringBootApplication
@EnableEurekaClient
public class Gateway9528Main {
    public static void main(String[] args) {

        SpringApplication.run(Gateway9528Main.class,args );
    }
}
