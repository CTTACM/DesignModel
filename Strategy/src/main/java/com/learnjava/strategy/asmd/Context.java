package com.learnjava.strategy.asmd;

/**
 * @author admin
 * @description: 加减乘除策略模式实例：上下文类
 * @date 2022/2/1417:19
 */
public class Context {
    private Strategy strategy;
    Context(Strategy strategy){
        this.strategy = strategy;
    }
    public int executeStrategy(int num1, int num2){
        return this.strategy.Calculate(num1, num2);
    }
}
