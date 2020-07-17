package com.gnaw.springcloud;

import com.gnaw.myloadBalance.MyLoadBalanced;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @program: spring-cloud2020
 * @description:
 * @author: wang_sir
 * @create: 2020-06-26 13:05
 **/
@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "CLOUD-PAYMENT-SERVICE",configuration = MyLoadBalanced.class)
public class CustomerOrderMain90 {
    public static void main(String[] args) {

        SpringApplication.run(CustomerOrderMain90.class,args);

    }
}
