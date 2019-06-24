package com.example.strategyDemo;

public class ConcreteStrategyA implements Strategy{


    @Override
    public void strategyInterface() {
        System.out.println("实现策略1");
    }
}
