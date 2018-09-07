package com.yejian.spring.factory;

import org.springframework.beans.factory.FactoryBean;
import org.joda.time.DateTime;
/**
 * 模拟工厂方法模式
 * @author YeJian (jian.ye@downjoy.com)
 * @Description:
 * @date 2018/8/31 17:43
 */
public class NextDayDateFactoryBean  implements FactoryBean{
    @Override
    public Object getObject() throws Exception {
        return new DateTime();
    }

    @Override
    public Class<?> getObjectType() {
        return DateTime.class;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
