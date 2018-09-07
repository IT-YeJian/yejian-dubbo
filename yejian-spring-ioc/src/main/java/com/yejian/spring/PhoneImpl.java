package com.yejian.spring;

import com.yejian.spring.model.Phone;

/**
 * @author YeJian (jian.ye@downjoy.com)
 * @Description:
 * @date 2018/8/29 14:19
 */
public class PhoneImpl implements Phone {

    @Override
    public void sayNumber() {
        System.out.println("my number is 12323");
    }
}
