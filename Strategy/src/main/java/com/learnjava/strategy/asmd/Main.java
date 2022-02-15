package com.learnjava.strategy.asmd;

/**
 * @author admin
 * @description: 加减乘除策略模式实例：使用策略模式
 * @date 2022/2/1417:24
 */
public class Main {
    public static void main(String[] args) {
        Context contextAdd = new Context(new Add());
        System.out.println(contextAdd.executeStrategy(1, 2));
        Context contextSub = new Context(new Sub());
        System.out.println(contextSub.executeStrategy(1, 2));
        Context contextMulti = new Context(new Multi());
        System.out.println(contextMulti.executeStrategy(1, 2));
        Context contextDiv = new Context(new Div());
        System.out.println(contextDiv.executeStrategy(1, 2));
    }
}
