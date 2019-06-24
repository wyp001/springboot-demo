package com.example.orderDemo;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;


/**
 * 1.使用@Component注解将其交给Spring容器自动加载
 *
 * 2.注解@Order的作用是定义Spring容器加载Bean的顺序
 *          1）注解可以作用在类、方法、字段声明（包括枚举常量）；
 *          2）注解有一个int类型的参数，可以不传，默认是最低优先级；
 *          3）通过常量类的值我们可以推测参数值越小优先级越高；
 *
 */
@Component
@Order(1)
public class Cat {

    private String name;

    public Cat(){
        System.out.println("Order:1");
    }

    /**
     * 启动程序后控制台输出日志为
     *      Order:1
     *      Order:2
     *      Order:3
     */

}
