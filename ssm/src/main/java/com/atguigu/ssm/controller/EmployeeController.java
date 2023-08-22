package com.atguigu.ssm.controller;

import com.atguigu.ssm.pojo.Employee;
import com.atguigu.ssm.service.EmployeeService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @projectName: SSM
 * @package: com.atguigu.ssm.controller
 * @className: EmployeeController
 * @author: SingKwan
 * @description: TODO
 * @date: 2023/4/3 10:08
 * @version: 1.0
 * 查询所有的员工信息-->/employee -->GET
 * 根据id查询员工信息-->/employee/page/1 -->GET
 * 跳转到添加页面-->/to/add -->GET
 * 添加员工信息-->/employee -->POST
 * 跳转到修改页面-->/employee/1 -->GET
 * 修改员工信息-->/employee -->PUT
 * 删除员工信息-->/employee/1 -->DELETE
 */
@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping(value = "/employee/page/{pageNum}",method = RequestMethod.GET)
    public String getEmployeePage(@PathVariable("pageNum")Integer pageNum,Model model){
        PageInfo<Employee> page=employeeService.getEmployeePage(pageNum);
        model.addAttribute("page",page);
        return "employee";
    }

    @RequestMapping(value = "/employee",method = RequestMethod.GET)
    public String getAllEmployee(Model model){
        List<Employee> list=employeeService.getAllEmployee();
        model.addAttribute("list",list);
        return "employee_list";
    }

    @RequestMapping(value = "/employee",method = RequestMethod.POST)
    public String addEmployee(Employee employee){
        employeeService.addEmployee(employee);
        return "redirect:/employee/page/1";
    }

    @RequestMapping(value = "/employee/{id}",method = RequestMethod.GET)
    public String toUpdate(@PathVariable("id")Integer id,Model model){
        Employee employee=employeeService.getEmployeeById(id);
        model.addAttribute("employee",employee);
        return "employee_update";
    }

    @RequestMapping(value = "/employee",method = RequestMethod.PUT)
    public String updateEmployee(Employee employee){
        employeeService.updateEmployee(employee);
        return "redirect:/employee/page/1";
    }

    @RequestMapping(value = "/employee/{id}",method = RequestMethod.DELETE)
    public String deleteEmployee(@PathVariable("id")Integer id){
        employeeService.deleteEmployee(id);
        return "redirect:/employee/page/1";
    }



}
