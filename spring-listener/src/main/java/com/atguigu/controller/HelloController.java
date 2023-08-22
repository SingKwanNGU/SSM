package com.atguigu.controller;

import com.atguigu.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @projectName: SSM
 * @package: com.atguigu.controller
 * @className: HelloController
 * @author: SingKwan
 * @description: TODO
 * @date: 2023/3/31 23:37
 * @version: 1.0
 */
@Controller
public class HelloController {

    @Autowired
    private HelloService helloService;
}
