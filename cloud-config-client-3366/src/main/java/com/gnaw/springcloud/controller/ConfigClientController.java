package com.gnaw.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: spring-cloud2020
 * @description:
 * @author: wang_sir
 * @create: 2020-07-29 16:05
 **/
@RestController
@RefreshScope
public class ConfigClientController {

    @Value("${server.port}")
    private String port;

    @Value("${config.info}")
    private String configInfo;

    @GetMapping("/configInfo")
    public String getConfigInfo(){
        return "port"+port+"---->"+configInfo;
    }
}
