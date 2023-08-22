package com.atguigui.spring.test;

import com.atguigu.spring.pojo.Clazz;
import com.atguigu.spring.pojo.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IocByXmlTest {

    @Test
    public void testIOC(){
        ApplicationContext context=new ClassPathXmlApplicationContext("spring-ioc.xml");
        Student student = context.getBean("StudentOne", Student.class);
        System.out.println(student);
    }

    @Test
    public void testIOC2(){
        ApplicationContext context=new ClassPathXmlApplicationContext("spring-ioc.xml");
        Student student = context.getBean("StudentTwo", Student.class);
        System.out.println(student);
    }

    @Test
    public void testIOC3(){
        ApplicationContext context=new ClassPathXmlApplicationContext("spring-ioc.xml");
        Student student = context.getBean("StudentThree", Student.class);
        System.out.println(student);
    }

    @Test
    public void testIOC4(){
        ApplicationContext context=new ClassPathXmlApplicationContext("spring-ioc.xml");
        Clazz clazzOne = context.getBean("clazzOne", Clazz.class);
        System.out.println(clazzOne);
    }


    @Test
    public void testIOC5(){
        ApplicationContext context=new ClassPathXmlApplicationContext("spring-ioc.xml");
        Clazz clazzOne = context.getBean("clazzTwo", Clazz.class);
        System.out.println(clazzOne);
    }

}
