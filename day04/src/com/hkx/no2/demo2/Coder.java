package com.hkx.no2.demo2;

public class Coder {
//    属性：姓名，工号，薪资
//    构造方法：无参构造方法
//    成员方法：

    private String id;
    private String name;
    private int xingZi;

    public Coder() {
    }

    public Coder(String id, String name, int xingZi) {
        this.id = id;
        this.name = name;
        this.xingZi = xingZi;
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
    public void intro(){
        System.out.println(name + id);
    }
    public void showSalary(){
        System.out.println(xingZi);
    }
    public void work(){
        System.out.println("正在努力写代码....");
    }
}
