package com.yejian.spring;

import com.yejian.spring.service.HelloWorldService;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * @author YeJian (jian.ye@downjoy.com)
 * @Description:
 * @date 2018/8/9 18:10
 */
@Service("helloWorldService")
public class HelloWorldServiceImpl implements HelloWorldService {

    public HelloWorldServiceImpl() {
        System.out.println("Construct method");
    }

    @Override
    public void sayHello(String name) {
        System.out.println("Hello "+name);
    }

    @PostConstruct
    public void post(){
        System.out.println("post");
    }
}
