package com.yejian.spring;

import com.yejian.spring.factory.NextDayDateFactoryBean;
import com.yejian.spring.model.DateFOO;
import com.yejian.spring.model.FXNewsProvider;
import com.yejian.spring.model.MyUser;
import com.yejian.spring.model.Person;
import com.yejian.spring.service.HelloWorldService;
import org.joda.time.DateTime;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.beans.factory.support.*;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import java.util.Arrays;
import java.util.Collections;

/**
 * Hello world!
 *
 */

public class App 
{
    //容器启动阶段
    //Spring的IoC容器在实现的时候，
    // 充分运用了这两个实现阶段的不同特点，在每个阶段都加入了相应的容器扩展点，
    // 以便我们可以根据具体场景的需要加入自定义的扩展逻辑
    public static void main( String[] args ) throws Exception {
        /*BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("beans.xml"));
        HelloWorldService helloWorldService = (HelloWorldService)beanFactory.getBean("helloWorldService");
        helloWorldService.sayHello("yeajian");*/

       /* ApplicationContext context  = new ClassPathXmlApplicationContext("beans.xml");
        HelloWorldService helloWorld  = (HelloWorldService)context.getBean("helloWorldService");
        helloWorld.sayHello("yejian");*/

       /*ApplicationContext context  = new FileSystemXmlApplicationContext("classpath:beans.xml");
        HelloWorldService helloWorld  = (HelloWorldService)context.getBean("helloWorldService");
        helloWorld.sayHello("yejian");*/

        //DefaultListableBeanFactory defaultListableBeanFactory = new DefaultListableBeanFactory();
        //BeanFactory beanFactory = viaXmlFile(defaultListableBeanFactory);
        //viaCode(defaultListableBeanFactory);
        /*HelloWorldService helloWorldService = (HelloWorldService)beanFactory.getBean("helloWorldService");
        helloWorldService.sayHello("yejian");
*/

       /* Xml*/ /*BeanDefinitionReader --> beans.xml --> BeanDefinition -->BeanDefinitionRegistry*/ /*完成bean的注册和加载*/
/*
        String[] beanDefinitionNames = defaultListableBeanFactory.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }*/
       // ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
       // HelloWorldService helloWorldService = (HelloWorldService) context.getBean("helloWorldService");
        //helloWorldService.sayHello("yejian");

        //2.BeanFactoryPostProcessor
        //声明将被处理的BeanFactory
       /* ConfigurableListableBeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("beans.xml"));
        //声明要使用的BeanFactoryPostProcessor
        PropertyPlaceholderConfigurer propertyPlaceholderConfigurer =
                new PropertyPlaceholderConfigurer();


        propertyPlaceholderConfigurer.setLocation(new ClassPathResource("ioc.properties"));
        //执行后处理操作
        propertyPlaceholderConfigurer.postProcessBeanFactory(beanFactory);

        Person person = (Person) beanFactory.getBean("person");
        System.out.println(person.getUsername()+" : "+person.getAge());*/

       //使用ApplicationContext
       // ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
    /*    Object nextDay = context.getBean("nextDay");
        System.out.println(nextDay instanceof DateTime);

        Object factoryBean = context.getBean("&nextDay");
        System.out.println(factoryBean instanceof FactoryBean);

        System.out.println(factoryBean instanceof NextDayDateFactoryBean);

        Object factoryValue = ((FactoryBean)factoryBean).getObject();
        System.out.println(factoryValue instanceof DateTime);
        System.out.println(((DateTime)nextDay).getDayOfYear());
        System.out.println(((DateTime)nextDay).getDayOfYear()==((DateTime)factoryValue).getDayOfYear());*/

//        for (int i=0;i<=2;i++){
//            Person person = (Person)context.getBean("person");
//            System.out.println(person.getUsername()+" : "+person.getAge()+" at "+person.getAddress()+" day"+person.getDateTime());
//            person.sa();
//        }


         /*BeanFactory beanFactory  = new XmlBeanFactory(new ClassPathResource("beans.xml"));
        FXNewsProvider fxNewsProvider =(FXNewsProvider) beanFactory.getBean("fxNewsProvider");
        fxNewsProvider.getAndPersisterNew();*/

        //1.直接编码方式
//
//        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//        DateFOO dateFOO = (DateFOO) context.getBean("dateFOO");
//        System.out.println(dateFOO.getDate());
        Integer []actIds =new Integer[]{40,100,300};
        Arrays.sort(actIds, Collections.<Integer>reverseOrder());
        for (Integer actId : actIds) {
            System.out.println(actId);
        }

        //  MyUser myUser = (MyUser) context.getBean("myUser");
       // System.out.println(myUser.getName() +"==="+myUser.getAge());

    }

   /* private static BeanFactory viaXmlFile(BeanDefinitionRegistry registry) {
        XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(registry);
        xmlBeanDefinitionReader.loadBeanDefinitions("beans.xml");
        return (BeanFactory)registry;
    }*/


   /* private static BeanFactory viaCode(BeanDefinitionRegistry registry) {
        AbstractBeanDefinition abstractBeanDefinition =
                new RootBeanDefinition(HelloWorldServiceImpl.class);
        //将bean定义注册到容器中
        registry.registerBeanDefinition("helloWorldService",abstractBeanDefinition);

        return (BeanFactory)registry;
    }*/
}
