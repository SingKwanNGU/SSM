package com.atguigu.controller;

import com.atguigu.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestRequestMappingController {
    @RequestMapping(
            value = {"/hello","/abc"},
            method = {RequestMethod.POST,RequestMethod.GET},
            headers = {"referer"}
    )
    public String hello(){
        return "success";
    }
    @RequestMapping("/a?c/test/ant")
    public String testAnt(){

        return "success";
    }

    @RequestMapping("/test/rest/{id}")
    public String testRest(@PathVariable("id") Integer id){
        System.out.println("id:"+id);
        return "success";
    }

    @RequestMapping("/param/pojo")
    public String getParamByPojo(User user){
        System.out.println(user);
        return "success";
    }

}
