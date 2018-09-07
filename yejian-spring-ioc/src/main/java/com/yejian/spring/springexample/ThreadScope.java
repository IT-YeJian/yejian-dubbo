package com.yejian.spring.springexample;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.config.Scope;

import java.util.Map;

/**
 * @author YeJian (jian.ye@downjoy.com)
 * @Description:
 * @date 2018/8/30 17:02
 */
public class ThreadScope implements Scope{


    public Object get(String name, ObjectFactory<?> factory)
    {
        Object result = null;

        Map hBeans = ThreadScopeContextHolder.currentThreadScopeAttributes().getBeanMap();

        if (!hBeans.containsKey(name)) {
            result = factory.getObject();

            hBeans.put(name, result);
        } else {
            result = hBeans.get(name);
        }

        return result;
    }

    public Object remove(String name)
    {
        Object result = null;

        Map hBeans = ThreadScopeContextHolder.currentThreadScopeAttributes().getBeanMap();

        if (hBeans.containsKey(name)) {
            result = hBeans.get(name);

            hBeans.remove(name);
        }

        return result;
    }

    public void registerDestructionCallback(String name, Runnable callback) {
        ThreadScopeContextHolder.currentThreadScopeAttributes().registerRequestDestructionCallback(name, callback);
    }

    public Object resolveContextualObject(String key)
    {
        return null;
    }

    public String getConversationId()
    {
        return Thread.currentThread().getName();
    }
}
