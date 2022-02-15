package com.learnjava.strategy.rds;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * @author admin
 * @description: 策略模式中的Context实现类
 * @date 2022/2/159:50
 */
public class RdsServiceFactoryImpl implements RdsServiceFactory{
    /**
     * https://blog.csdn.net/u010325193/article/details/80093908
     * Map和@Resource这样的方式可以把所有Service的类型（实现类）的bean全部注入到servcieMap中。
     */
    @Resource
    private Map<String, RdsDatabaseService> container = new HashMap<>(4);

    @Override
    public RdsDatabaseService getService(String engine) {
        RdsDatabaseService rdsDatabaseService = null;
        try {
            rdsDatabaseService = container.get(engine);
        } catch (Exception e) {
            log.info("not find serviceName{}", e.getMessage());
        }
        if(rdsDatabaseService == null){
            log.info("engine:{} miss match service", engine);
            throw new NullPointerException("未匹配到对应的RDS服务,请检查数据库引擎类型");
        }
        return rdsDatabaseService;
    }
}
