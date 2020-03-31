package com.lixiangyan.exception;/*
 *@program: gpms
 *@description: 注册时异常类
 *@author: lixiangyan
 *@create: 2020-03-30 21:39
 **/

public class RegistException extends RuntimeException {

    public RegistException() {
    }

    public RegistException(String message) {
        super(message);
    }
}
