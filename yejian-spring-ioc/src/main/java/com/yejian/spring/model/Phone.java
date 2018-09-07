package com.yejian.spring.model;

import com.yejian.spring.service.PhoneServiceCallable;
import org.springframework.stereotype.Component;

/**
 * @author YeJian (jian.ye@downjoy.com)
 * @Description: 利用接口注入的方式 给Person注入电话类
 * @date 2018/8/29 10:55
 */


public interface Phone {
    void  sayNumber();
}
