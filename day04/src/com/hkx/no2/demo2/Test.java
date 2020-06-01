package com.hkx.no2.demo2;

public class Test {
    public static void main(String[] args) {
        //    定义测试类，创建Manager对象，创建Coder对象，并测试
        Manager m = new Manager();
        m.setId("111");
        m.setJiangJin(22222);
        m.setMsg("奖金");
        m.setName("经理");
        m.setXingZi(1111);
        m.intro();
        m.showSalary();
        m.work();
        System.out.println("=============");
        Coder coder = new Coder();
        coder.setId("9999");
        coder.setName("员工");
        coder.setXingZi(33333);
        coder.intro();
        coder.showSalary();
        coder.work();
    }
}
