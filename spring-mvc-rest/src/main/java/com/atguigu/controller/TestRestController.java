package com.atguigu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * 测试rest访问user资源进行CRUD
 * 路径：/user
 * 查询所有的用户信息 ——>/user-->get
 * 根据id查询用户信息 ——>/user/1-->get
 * 添加用户信息 ——>/user-->post
 * 修改用户信息 ——>/user-->put
 * 根据id删除用户信息 ——>/user/1-->delete
 */
@Controller
public class TestRestController {

//    @RequestMapping(value = "/user",method = RequestMethod.GET)
    @GetMapping("/user")
    public String getAllUser(){
        System.out.println("查询所有的用户信息 ——>/user-->get");
        return "success";
    }

//    @RequestMapping(value = "/user/{id}",method = RequestMethod.GET)
    @GetMapping("/user/{id}")
    public String getUserById(@PathVariable("id") Integer id){
        System.out.println("根据id查询用户信息 ——>/user/"+id+"-->get");
        return "success";
    }


//    @RequestMapping(value = "/user" ,method = RequestMethod.POST)
    @PostMapping("/user")
    public String InsertUser(){
        System.out.println("添加用户信息 ——>/user-->post");
        return "success";
    }

    @PutMapping("/user")
//    @RequestMapping(value = "/user" ,method = RequestMethod.PUT)
    public String updateUser(){
        System.out.println("修改用户信息 ——>/user-->put");
        return "success";
    }

//    @RequestMapping(value = "/user/{id}" ,method = RequestMethod.DELETE)
    @DeleteMapping("/user/{id}")
    public String deleteUser(@PathVariable("id")Integer id){
        System.out.println("根据id删除用户信息 ——>/user/"+id+"-->delete");
        return "success";
    }

}
