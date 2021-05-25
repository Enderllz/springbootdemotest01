package com.ming.springbootdemotest01.impl;

import com.ming.springbootdemotest01.service.Animal;
import org.springframework.stereotype.Component;

@Component
public class Dog implements Animal {
    @Override
    public void use() {
        System.out.println("dog"+Dog.class.getSimpleName()+"是看门用的");
    }
}
