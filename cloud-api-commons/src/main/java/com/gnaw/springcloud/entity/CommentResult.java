package com.gnaw.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @program: spring-cloud2020
 * @description: 封装结果集
 * @author: wang_sir
 * @create: 2020-06-25 20:29
 **/
@AllArgsConstructor
@Data
@NoArgsConstructor
public class CommentResult<T> implements Serializable {

    private Integer code;
    private String message;
    private T       data;

    public CommentResult(Integer code,String message){

        this(code,message,null);
    }
}
