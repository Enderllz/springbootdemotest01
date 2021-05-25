package com.ming.springbootdemotest01.impl;

import com.ming.springbootdemotest01.service.Animal;
import com.ming.springbootdemotest01.service.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BusinessPerson implements Person {
    @Autowired
    @Qualifier("dog")
    private Animal animal = null;

    @Override
    public void service(){
        this.animal.use();
    }

    @Override
    public void setAnimal(Animal animal) {
        this.animal = animal;
    }
}
