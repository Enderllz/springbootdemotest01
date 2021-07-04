package com.ming.springbootdemotest01;

import java.util.LinkedHashMap;

public class own {
    public LinkedHashMap<Integer, String> Who(){
        LinkedHashMap<Integer, String> a = new LinkedHashMap<>();
        a.put(1,"2");
        return a;
    }
    public static void main(String[] args) {
        own fuck = new own();
        System.out.println(fuck.Who());
    }
}
