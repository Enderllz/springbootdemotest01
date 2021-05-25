package com.ming.springbootdemotest01.impl;

import com.ming.springbootdemotest01.service.Animal;
import org.springframework.stereotype.Component;

@Component
public class Cat implements Animal {
    @Override
    public void use() {
        System.out.println("猫"+Cat.class.getSimpleName()+"是抓老鼠");
    }
}
