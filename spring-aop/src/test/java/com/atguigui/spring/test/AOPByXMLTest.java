package com.atguigui.spring.test;

import com.atguigu.spring.aop.xml.Calculator;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AOPByXMLTest {

    @Test
    public void testAOPByXML(){
        ApplicationContext context=new ClassPathXmlApplicationContext("aop-xml.xml");
        Calculator calculator = context.getBean(Calculator.class);
        calculator.div(10,2);
    }
}
