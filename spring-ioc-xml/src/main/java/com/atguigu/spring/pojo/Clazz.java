package com.atguigu.spring.pojo;

import java.util.List;

public class Clazz {
    private Integer clazzId;
    private String clazzName;

    private List<Student> students;

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public Integer getClazzId() {
        return clazzId;
    }
    public void setClazzId(Integer clazzId) {
        this.clazzId = clazzId;
    }
    public String getClazzName() {
        return clazzName;
    }
    public void setClazzName(String clazzName) {
        this.clazzName = clazzName;
    }

    @Override
    public String toString() {
        return "Clazz{" +
                "clazzId=" + clazzId +
                ", clazzName='" + clazzName + '\'' +
                ", students=" + students +
                '}';
    }

    public Clazz() {
    }

    public Clazz(Integer clazzId, String clazzName, List<Student> students) {
        this.clazzId = clazzId;
        this.clazzName = clazzName;
        this.students = students;
    }
}
