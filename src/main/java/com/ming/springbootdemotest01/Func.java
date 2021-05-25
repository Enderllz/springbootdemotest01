package com.ming.springbootdemotest01;


public interface Func {
    public static final String INFO = "Information";
    public abstract String getInfo();
    public default String woo(){
        return "No";
    }
}
