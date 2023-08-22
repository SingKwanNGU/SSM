package com.atguigu.spring.test;

import com.atguigu.spring.pojo.HelloWorld;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorldTest {

    @Test
    public void test(){
        ApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext.xml");
         HelloWorld helloworld =(HelloWorld)context.getBean("helloworld");
         helloworld.sayHello();
    }
}
