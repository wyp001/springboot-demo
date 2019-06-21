package com.example.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BeanTest {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(BeanTest.class, args);

        Object obj01 = context.getBean("persion");
        System.out.println("obj01的hash地址"+obj01);
        Object obj02 = context.getBean("persion");
        System.out.println("obj02的hash地址"+obj02);
    }
}
