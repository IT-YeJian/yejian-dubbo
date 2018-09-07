package com.yejian.spring.model;

import java.io.Serializable;

/**
 * @author YeJian (jian.ye@downjoy.com)
 * @Description: 地址类
 * @date 2018/8/29 10:37
 */
public class Address implements Serializable{

    private String city;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
