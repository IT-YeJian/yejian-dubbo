package com.yejian.spring.impl;

import com.yejian.spring.service.IFXNewsPersister;
import org.springframework.stereotype.Component;

/**
 * @author YeJian (jian.ye@downjoy.com)
 * @Description: DowJonesNewsPersister数据访问方式
 * @date 2018/8/29 15:14
 */
@Component
public class DowJonesNewsPersister implements IFXNewsPersister {
    @Override
    public void persister() {
        System.out.println("持久化到DB");
    }
}
