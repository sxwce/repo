package com.hkx.homeWork.day01.T13;

//请定义教师类（Teacher），属性包括姓名和工号。。定义教课（teach）方法，输出“工号为xxx的xxx老师正在讲课”。
/**
 * 教师类
 */
public class Teacher {

    private Integer id; //工号
    private String name;    //姓名

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * 定义教课（teach）方法
     */
    public void teach(){
        System.out.println("工号为"+id+"的"+name+"老师正在讲课");
    }

}
