package com.learnjava.strategy.rds;

import javax.annotation.Resource;

/**
 * @author admin
 * @description: TODO
 * @date 2022/2/159:58
 */
public class Main {
    @Resource
    private RdsServiceFactory rdsServiceFactory;

    public void MainFunc(String[] args) {
        String engine = "xxx";
        getService(engine);
    }
    /**
     *  获取不同引擎对应的RDS服务
     * @param engine 数据库引擎
     * @return
     */
    private RdsDatabaseService getService(String engine){
        return  rdsServiceFactory.getService(engine);
    }
}
