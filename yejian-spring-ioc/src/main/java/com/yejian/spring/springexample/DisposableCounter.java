package com.yejian.spring.springexample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.DisposableBean;

/**
 * @author YeJian (jian.ye@downjoy.com)
 * @Description:
 * @date 2018/8/30 17:33
 */
public class DisposableCounter  extends Counter implements DisposableBean {

    final Logger logger = LoggerFactory.getLogger(DisposableCounter.class);

    /**
     * Implementing method from <code>DisposableBean</code>.
     */
    public void destroy() throws Exception {
        logger.debug("Processing destroy.");

        reset();
    }
}
