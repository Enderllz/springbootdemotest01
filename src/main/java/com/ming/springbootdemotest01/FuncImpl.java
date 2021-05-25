package com.ming.springbootdemotest01;

import org.springframework.beans.factory.annotation.Autowired;

import javax.xml.crypto.Data;

public class FuncImpl implements Func {

    public String getInfo(){
        return "func";
    }
}
