package com.example.orderDemo;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class Cat3 {

    private String name;

    public Cat3() {
        System.out.println("Order:3");
    }

}
