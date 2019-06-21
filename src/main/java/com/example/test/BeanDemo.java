package com.example.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

//@Service
@Configuration
public class BeanDemo {

    @Bean(name = "persion")
    @Scope("prototype")
    public BeanDemo getBean(){
        BeanDemo beanDemo = new BeanDemo();
        System.out.println("调用方法： "+ beanDemo);
        return beanDemo;
    }

}
