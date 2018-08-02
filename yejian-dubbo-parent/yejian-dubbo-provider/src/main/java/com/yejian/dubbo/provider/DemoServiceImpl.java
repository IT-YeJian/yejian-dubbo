package com.yejian.dubbo.provider;

import com.yejian.common.service.DemoService;

/**
 * @author YeJian (jian.ye@downjoy.com)
 * @Description: dubbo服务实现类
 * @date 2018/8/2 15:33
 */
public class DemoServiceImpl  implements DemoService {
    @Override
    public String satHello(String name) {
        return "Hello "+name;
    }
}
