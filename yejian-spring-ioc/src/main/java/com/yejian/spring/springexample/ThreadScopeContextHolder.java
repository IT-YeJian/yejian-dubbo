package com.yejian.spring.springexample;

/**
 * @author YeJian (jian.ye@downjoy.com)
 * @Description:
 * @date 2018/8/30 17:03
 */
public class ThreadScopeContextHolder {
    private static final ThreadLocal<ThreadScopeAttributes> threadScopeAttributesHolder = new InheritableThreadLocal() {
        protected ThreadScopeAttributes initialValue() {
            return new ThreadScopeAttributes();
        }
    };

    public static ThreadScopeAttributes getThreadScopeAttributes()
    {
        return (ThreadScopeAttributes)threadScopeAttributesHolder.get();
    }

    public static void setThreadScopeAttributes(ThreadScopeAttributes accessor)
    {
        threadScopeAttributesHolder.set(accessor);
    }

    public static ThreadScopeAttributes currentThreadScopeAttributes()
            throws IllegalStateException
    {
        ThreadScopeAttributes accessor = (ThreadScopeAttributes)threadScopeAttributesHolder.get();

        if (accessor == null) {
            throw new IllegalStateException("No thread scoped attributes.");
        }

        return accessor;
    }
}
