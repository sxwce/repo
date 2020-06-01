package com.hkx.no2.demo2;

public class Manager {
//    定义两个类，经理类Manager，程序员类Coder
//    定义测试类，创建Manager对象，创建Coder对象，并测试

    private String id;
    private String name;
    private int  xingZi;
    private int jiangJin;
    private String msg;;

    public Manager() {
    }

    public Manager(String id, String name, int xingZi, int jiangJin, String msg) {
        this.id = id;
        this.name = name;
        this.xingZi = xingZi;
        this.jiangJin = jiangJin;
        this.msg = msg;
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

    public int getXingZi() {
        return xingZi;
    }

    public void setXingZi(int xingZi) {
        this.xingZi = xingZi;
    }

    public int getJiangJin() {
        return jiangJin;
    }

    public void setJiangJin(int jiangJin) {
        this.jiangJin = jiangJin;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void intro(){
        System.out.println(name + id);
    }
    public void showSalary(){
        System.out.println(jiangJin + msg);
    }
    public void work(){
        System.out.println("正在努力的做着管理工作,分配任务,检查员工提交上来的代码.....");
    }
}
