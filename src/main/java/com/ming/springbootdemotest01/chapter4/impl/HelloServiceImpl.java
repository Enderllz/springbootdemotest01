package com.ming.springbootdemotest01.chapter4.impl;

import com.ming.springbootdemotest01.chapter4.service.HelloService;

public class HelloServiceImpl implements HelloService {

    @Override
    public void sayHello(String name) {
        if(name==null || name.trim().equals("")){
            throw new RuntimeException("Parameter is null!!!");
        }
        System.out.println("hello"+name);
    }
}
