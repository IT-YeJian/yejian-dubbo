package com.yejian.spring.springexample;

/**
 * @author YeJian (jian.ye@downjoy.com)
 * @Description:
 * @date 2018/8/30 17:04
 */
public class ThreadScopeRunnable implements Runnable{
    protected Runnable target = null;

    public ThreadScopeRunnable(Runnable target)
    {
        this.target = target;
    }

    public final void run()
    {
        try
        {
            this.target.run();
        } finally {
            ThreadScopeContextHolder.currentThreadScopeAttributes().clear();
        }
    }
}
