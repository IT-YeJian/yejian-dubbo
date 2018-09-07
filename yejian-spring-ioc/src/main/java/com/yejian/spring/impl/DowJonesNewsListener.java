package com.yejian.spring.impl;

import com.yejian.spring.service.IFXNewsListener;
import org.springframework.stereotype.Component;

/**
 * @author YeJian (jian.ye@downjoy.com)
 * @Description: DowJonesNewsListener新闻社的新闻获取方式
 * @date 2018/8/29 15:11
 */
@Component
public class DowJonesNewsListener implements IFXNewsListener {
    @Override
    public void getNews() {
        System.out.println("获取新闻");
    }
}
