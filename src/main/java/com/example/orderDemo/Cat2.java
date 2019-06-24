package com.example.orderDemo;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(2)
public class Cat2 {

    private String name;

    public Cat2() {
        System.out.println("Order:2");
    }
}
