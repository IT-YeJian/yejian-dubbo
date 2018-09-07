package com.yejian.spring.springexample;

import org.apache.commons.logging.LogFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.Assert;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author YeJian (jian.ye@downjoy.com)
 * @Description:
 * @date 2018/8/30 17:02
 */
public class ThreadScopeAttributes {
    final Logger logger = LoggerFactory.getLogger(ThreadScopeAttributes.class);

    protected final Map<String, Object> hBeans = new HashMap();
    protected final Map<String, Runnable> hRequestDestructionCallbacks = new LinkedHashMap();

    protected final Map<String, Object> getBeanMap()
    {
        return this.hBeans;
    }

    protected final void registerRequestDestructionCallback(String name, Runnable callback)
    {
        Assert.notNull(name, "Name must not be null");
        Assert.notNull(callback, "Callback must not be null");

        this.hRequestDestructionCallbacks.put(name, callback);
    }

    protected final void clear()
    {
        processDestructionCallbacks();

        this.hBeans.clear();
    }

    private final void processDestructionCallbacks()
    {
        for (String name : this.hRequestDestructionCallbacks.keySet()) {
            Runnable callback = (Runnable)this.hRequestDestructionCallbacks.get(name);

            this.logger.debug("Performing destruction callback for '" + name + "' bean" + " on thread '" + Thread.currentThread().getName() + "'.");

            callback.run();
        }

        this.hRequestDestructionCallbacks.clear();
    }
}
