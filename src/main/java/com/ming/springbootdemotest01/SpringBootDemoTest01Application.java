package com.ming.springbootdemotest01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class SpringBootDemoTest01Application extends WebMvcConfigurerAdapter {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDemoTest01Application.class, args);

    }
}
