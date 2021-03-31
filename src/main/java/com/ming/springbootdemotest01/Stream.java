package com.ming.springbootdemotest01;

import java.util.ArrayList;
import java.util.List;

public class Stream {
    static class OOMObject {
    };
    public static void main(String[] args) {
//        List<OOMObject> list = new ArrayList<OOMObject>();
//        while (true){
//            list.add(new OOMObject());
//        }
        System.out.println(String.valueOf(2).intern());
    }
}

