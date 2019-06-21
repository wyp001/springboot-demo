package com.example.test;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component  //@Component注解不能少
public class ValueDemo {

    //注入application.properties文件中的属性
    @Value("${spring.datasource.driverClassName}")
    private String driver;

    //注入常量aaa
    @Value("aaa")
    private String phone;

    @PostConstruct
    public void run(){
        System.out.println("===driver======"+driver);
        System.out.println("===phone======"+phone);

    }





}
