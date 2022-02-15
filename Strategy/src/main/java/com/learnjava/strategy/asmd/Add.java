package com.learnjava.strategy.asmd;

/**
 * @author admin
 * @description: 加减乘除策略模式实例：加法策略
 * @date 2022/2/1417:14
 */
public class Add implements Strategy{
    @Override
    public int Calculate(int num1, int num2) {
        return num1 + num2;
    }
}
