package com.gnaw.springcloud.controller;

import com.gnaw.springcloud.entity.CommentResult;
import com.gnaw.springcloud.entity.Payment;
import com.gnaw.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @program: spring-cloud2020
 * @description:
 * @author: wang_sir
 * @create: 2020-06-25 21:43
 **/
@RestController
public class PaymentController {
    @Autowired
    private PaymentService paymentService;

    @Value("${server.port}")
    private String port;

    @Autowired
    private DiscoveryClient discoveryClient;

    /**
     * 插入数据
     * @param payment
     * @return
     */
    @PostMapping("/payment/create")
    public CommentResult<Payment> create( @RequestBody Payment payment) {
        int result = paymentService.create(payment);
        if (result > 0) {
            return new CommentResult<Payment>(200, "插入数据成功---->port:"+port, payment);
        }else {
            return new CommentResult<Payment>(201,"插入数据失败----->port"+port,null);
        }
    }

    /**
     * 查询数据
     * @param id
     * @return
     */
    @GetMapping("/payment/get/{id}")
    public CommentResult<Payment> getPaymentById(@PathVariable("id") Long id) {
        Payment payment = paymentService.getPaymentById(id);
        if (payment != null) {
            return new CommentResult<Payment>(200, "查询数据成功---->port:"+port, payment);
        }else {
            return new CommentResult<Payment>(201,"查询数据有误---->port:"+port,null);
        }
    }

    @GetMapping("/payment/discovery")
    public Object discovery(){
        List<String> services = discoveryClient.getServices();
        System.out.println("注册的服务对象-------->"+services);
        List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE");
        for (ServiceInstance instance:instances){
            System.out.println(instance.getHost()+""+instance.getPort()+""+instance.getUri());
        }
        return this.discoveryClient;
    }

}
