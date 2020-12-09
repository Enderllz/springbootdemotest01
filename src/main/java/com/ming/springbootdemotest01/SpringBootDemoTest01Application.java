package com.ming.springbootdemotest01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class SpringBootDemoTest01Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDemoTest01Application.class, args);

    }
}
