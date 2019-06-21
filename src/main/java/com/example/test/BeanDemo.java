package com.example.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

//@Service
@Configuration
public class BeanDemo {

    @Bean
    @Scope("prototype")
    public BeanDemo getBean(){
        BeanDemo beanDemo = new BeanDemo();
        System.out.println("调用方法： "+ beanDemo);
        return beanDemo;
    }



}
