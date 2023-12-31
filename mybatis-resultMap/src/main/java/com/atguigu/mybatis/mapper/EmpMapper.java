package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmpMapper {

    Emp getEmpByEmpId(@Param("empId")Integer empId);

    Emp getEmpAndDeptByEmpId(@Param("empId")Integer empId);

    Emp getEmpAndDeptByStepOne(@Param("empId")Integer empId);

    List<Emp> getDeptAndEmpByStepTwo(@Param("deptId") Integer deptId);
}
