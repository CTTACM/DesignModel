package com.learnjava.strategy.rds;

/**
 * @author admin
 * @description: 策略模式中的Context接口：用于确定到底使用的是哪个数据库
 * @date 2022/2/159:49
 */
public interface RdsServiceFactory {
    /**
     *  通过不同的引擎获取不同的RDS服务
     * @param engine 数据库引擎
     * @return
     */
    RdsDatabaseService getService(String engine);
}
