package com.atguigu.spring.test;

import com.atguigu.spring.controller.UserController;
import com.atguigu.spring.dao.UserDao;
import com.atguigu.spring.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IOCByAnnotationTest {


    @Test
    public void test(){
        ApplicationContext context=new ClassPathXmlApplicationContext("spring-ioc-annotation.xml");
        UserController controller = context.getBean(UserController.class);
//        System.out.println(controller);
//        UserService service = context.getBean(UserService.class);
//        System.out.println(service);
//        UserDao dao = context.getBean(UserDao.class);
//        System.out.println(dao);
        controller.saveUser();
    }
}
