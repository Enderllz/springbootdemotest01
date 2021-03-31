package com.ming.springbootdemotest01;

import java.util.Calendar;

public class DaoExample {
    public String sayHello(String name){
        int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
        if (hour<6){
            return "凌晨好";
        }else {
            return "其他时间好";
        }
    }
}
