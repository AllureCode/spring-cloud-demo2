package com.gnaw.springcloud.entity;

import lombok.*;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @program: spring-cloud2020
 * @description: 支付实体类
 * @author: wang_sir
 * @create: 2020-06-25 20:26
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Accessors(chain = true)
public class Payment implements Serializable {

    private Long id;
    private String serial;
}
