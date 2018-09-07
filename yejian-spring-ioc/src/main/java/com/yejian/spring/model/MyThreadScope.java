package com.yejian.spring.model;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.config.Scope;

import java.util.HashMap;
import java.util.Map;

/**
 * 模拟线程范围内 共享数据例子
 * @author YeJian (jian.ye@downjoy.com)
 * @Description: Scope例子
 * @date 2018/8/30 16:22
 */
public class MyThreadScope implements Scope {

    private final ThreadLocal threadScope = new ThreadLocal(){
        @Override
        protected Object initialValue() {
            return new HashMap<>(1);
        }

    };
    @Override
    public Object get(String name, ObjectFactory<?> objectFactory) {
        Map scope = (Map) threadScope.get();
        Object object = scope.get(name);
        if (object == null) {
            object = objectFactory.getObject();
            scope.put(name, object);
        }
        return object;
    }

    @Override
    public Object remove(String name) {
        Map scope = (Map) threadScope.get();
        return scope.remove(name);

    }

    @Override
    public void registerDestructionCallback(String name, Runnable callback) {

    }

    @Override
    public Object resolveContextualObject(String key) {
        return null;
    }

    @Override
    public String getConversationId() {
        return null;
    }
}
