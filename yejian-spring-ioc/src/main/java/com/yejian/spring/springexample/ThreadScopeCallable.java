package com.yejian.spring.springexample;

import java.util.concurrent.Callable;

/**
 * @author YeJian (jian.ye@downjoy.com)
 * @Description:
 * @date 2018/8/30 17:03
 */
public class ThreadScopeCallable<V>
        implements Callable<V> {
    protected Callable<V> target = null;

    public ThreadScopeCallable(Callable<V> target)
    {
        this.target = target;
    }

    public V call()
            throws Exception
    {
        try
        {
            return this.target.call();
        } finally {
            ThreadScopeContextHolder.currentThreadScopeAttributes().clear();
        }
    }
}
