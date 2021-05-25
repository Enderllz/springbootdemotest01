package com.ming.springbootdemotest01;

import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.Arrays;

public class Stream {
    static class OOMObject {
    }


    public static void main(String[] args) throws Exception {
//        List<OOMObject> list = new ArrayList<OOMObject>();
//        while (true){
//            list.add(new OOMObject());
//        }

        ArrayList<Integer> A = new ArrayList<Integer>();
        int[] B = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] C = new int[3];
        System.out.println(String.valueOf(2).intern());
        System.out.println(Arrays.stream(C).sorted());
        School func = new School();
        func.setSchool("nupt");
        System.out.println(func.getSchool());
    }
}

