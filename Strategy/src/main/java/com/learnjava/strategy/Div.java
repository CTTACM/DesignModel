package com.learnjava.strategy;

/**
 * @author admin
 * @description: 除法策略
 * @date 2022/2/1417:16
 */
public class Div implements Strategy{
    @Override
    public int Calculate(int num1, int num2) {
        return num1 / num2;
    }
}
