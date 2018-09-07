package com.yejian.spring.impl;

import org.springframework.beans.factory.support.MethodReplacer;

import java.lang.reflect.Method;

/**
 * @author YeJian (jian.ye@downjoy.com)
 * @Description: 方法替换
 * @date 2018/9/3 10:55
 */
public class DowJonesPersisterMethodReplacer implements MethodReplacer {
    @Override
    public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
        System.out.println("Sorry 我是替换方法");
        return null;
    }
}
