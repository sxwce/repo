package com.hkx.demo04_Teacher;

/**
 * 请定义教师类（Teacher），属性包括姓名和工号。要求分别使用空参和有参构造方法创建对象，
 * 空参创建的对象通过setXxx赋值，有参创建的对象直接赋值。定义教课（teach）方法，输出“工号为xxx的xxx老师正在讲课”。
 */


public class Teacher {

    private String id;
    private String name;

    public Teacher(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Teacher() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void teach(){
        System.out.println("工号为"+id+"的"+name+"老师正在讲课");
    }
}
