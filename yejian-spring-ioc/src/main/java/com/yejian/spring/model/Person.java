package com.yejian.spring.model;

import com.yejian.spring.service.PhoneServiceCallable;
import org.joda.time.DateTime;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * @author YeJian (jian.ye@downjoy.com)
 * @Description:
 * @date 2018/8/10 10:47
 */
@Component
public class Person implements PhoneServiceCallable/*,BeanFactoryAware*/   /*implements Serializable ,InitializingBean*/{


//    private BeanFactory beanFactory;
     private ObjectFactory objectFactory;

    //@Value("${username}")
    private String username;
   // @Value("${age}")
    private Integer age;

    private Address address;

    private Phone phone;

    private DateTime dateTime;

    public DateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(DateTime dateTime) {
        this.dateTime = dateTime;
    }

    public Address getAddress() {
      //  return address;
//        return (Address)beanFactory.getBean("address");

        return (Address)objectFactory.getObject();
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Person(String username, Integer age) {
        this.username = username;
        this.age = age;
    }

    public Person() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        System.out.println("setAge s");
        this.age = age;
    }

    public void init(){
        System.out.println("my person init");
    }
    public void des(){
        System.out.println("my person des");
    }

    public void sa(){
        phone.sayNumber();
    }

    @Override
    public void setPhone(Phone phone) {
            this.phone = phone;
    }

//    @Override
//    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
//        this.beanFactory = beanFactory;
//    }


    public void setObjectFactory(ObjectFactory objectFactory) {
        this.objectFactory = objectFactory;
    }
}
