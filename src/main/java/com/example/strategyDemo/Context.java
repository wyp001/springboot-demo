package com.example.strategyDemo;

public class Context {

    //持有一个具体策略的对象
    private Strategy strategy;

    /**
     * 构造函数，传入一个具体策略对象
     * @param strategy   具体策略对象
     */
    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    /**
     * 策略方法
     */
    public void contextInterface(){
        strategy.strategyInterface();
    }

    public static void executeStrategy(int type){
        Strategy strategy = null;
        if(type == 1){
            strategy = new ConcreteStrategyA();
        }else {
            strategy = new ConcreteStrategyB();
        }
        Context context = new Context(strategy);
        context.contextInterface();
    }

    public static void main(String[] args) {
        Context.executeStrategy(2);
    }




}
