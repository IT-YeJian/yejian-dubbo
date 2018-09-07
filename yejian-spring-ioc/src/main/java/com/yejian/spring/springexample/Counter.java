package com.yejian.spring.springexample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author YeJian (jian.ye@downjoy.com)
 * @Description:
 * @date 2018/8/30 17:32
 */
public class Counter {
    final Logger logger = LoggerFactory.getLogger(Counter.class);

    protected int count = 0;

    /**
     * Gets count.
     */
    public int getCount() {
        return count;
    }

    /**
     * Increments count.
     */
    public synchronized int increment() {
        return ++count;
    }

    /**
     * Resets bean.
     */
    public void reset() throws Exception {
        logger.debug("Processing reset.");

        count = 0;
    }

    /**
     * Returns a string representation of the object.
     */
    /*@Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("{");
        sb.append(this.getClass().getName() + "-");
        sb.append("  count=" + count);
        sb.append("}");

        return sb.toString();
    }*/
}
