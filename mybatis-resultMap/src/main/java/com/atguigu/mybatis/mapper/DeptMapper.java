package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojo.Dept;
import org.apache.ibatis.annotations.Param;

public interface DeptMapper {

    Dept getEmpAndDeptByStepTwo(@Param("deptId")Integer deptId);

    Dept getDeptAndEmpByDeptId(@Param("deptId")Integer deptId);

    /**
     * 根据部门id通过分布查询查询出部门信息以及部门中的员工信息的第一步
     * @param deptId
     * @return
     */
    Dept getDeptAndEmpByStepOne(@Param("deptId")Integer deptId);

}
