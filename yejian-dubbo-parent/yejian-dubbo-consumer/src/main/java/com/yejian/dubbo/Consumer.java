package com.yejian.dubbo;

import com.yejian.common.service.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author YeJian (jian.ye@downjoy.com)
 * @Description: 消费方
 * @date 2018/8/2 16:33
 */
public class Consumer {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"META-INF/consumer.xml"});

       context.start();

        DemoService demoService = (DemoService) context.getBean("demoService");

        String yejian = demoService.satHello("yejian");
        System.out.println(yejian);

    }
}
