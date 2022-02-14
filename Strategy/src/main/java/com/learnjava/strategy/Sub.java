package com.learnjava.strategy;

/**
 * @author admin
 * @description: 减法策略
 * @date 2022/2/1417:14
 */
public class Sub implements Strategy{
    @Override
    public int Calculate(int num1, int num2) {
        return num1 - num2;
    }
}
