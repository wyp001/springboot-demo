package com.example.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BeanTest {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(BeanTest.class, args);

        /**
         * 输出结果如下：hash地址一样证明是是同一个对象
         * obj01的hash地址com.example.test.BeanDemo@88d6f9b
         * obj02的hash地址com.example.test.BeanDemo@88d6f9b
         */
        Object obj01 = context.getBean("getBean");
        System.out.println("obj01的hash地址"+obj01);
        Object obj02 = context.getBean("getBean");
        System.out.println("obj02的hash地址"+obj02);
    }
}
