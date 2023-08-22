package com.atguigui.spring.test;

import com.atguigu.spring.aop.annotation.Calculator;
import com.atguigu.spring.aop.annotation.CalculatorImpl;
import com.atguigu.spring.aop.annotation.LoggerAspect;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AOPTest {

    @Test
    public void testAOPByAnnotation(){
        ApplicationContext context=new ClassPathXmlApplicationContext("aop-annotation.xml");
//        CalculatorImpl bean = context.getBean(CalculatorImpl.class);
//        bean.add(1,7);
        Calculator calculator = context.getBean(Calculator.class);
        calculator.div(10,1);


    }
}
