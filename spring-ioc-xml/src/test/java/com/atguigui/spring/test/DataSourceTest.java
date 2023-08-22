package com.atguigui.spring.test;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.SQLException;

public class DataSourceTest {

    private Logger logger= Logger.getLogger(DataSourceTest.class);


    @Test
    public  void testDataSource() throws SQLException {
        ApplicationContext context=new ClassPathXmlApplicationContext("spring-datasource.xml");
        DataSource dataSource = context.getBean("dataSource", DataSource.class);
        System.out.println(dataSource.getConnection());
    }
}
