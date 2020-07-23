package com.gnaw.springcloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @program: spring-cloud2020
 * @description: gateway第二种配置方式 java代码
 * @author: wang_sir
 * @create: 2020-07-23 10:26
 **/
@Component
@Configuration
public class ConfigGateway {
    /**
     * 利用java代码进行配置gateway路由
     * @param routeBuilder
     * @return
     */
    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder routeBuilder){
        RouteLocatorBuilder.Builder routes = routeBuilder.routes();
        routes.route("path_route_gateway",
                t->t.path("/guonei").
                        uri("http://news.baidu.com/guonei")
                        ).build();
        return routes.build();

    }
}
