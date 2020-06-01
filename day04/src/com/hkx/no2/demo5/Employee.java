package com.hkx.no2.demo5;

public abstract  class Employee {
    /**
     * 1.在传智播客有很多员工(Employee),按照工作内容不同分教研部员工(Teacher)和行政部员工 (AdminStaff)
     * 2.教研部根据教学的方式不同又分为讲师(Lecturer)和助教(Tutor)
     * 3.行政部根据负责事项不同,又分为维护专员(Maintainer),采购专员(Buyer)
     * 4.公司的每一个员工都编号,姓名和其负责的工作
     * 5.每个员工都有工作的功能,但是具体的工作内容又不一样,在向上抽取的时候定义为抽象方法
     */
    private String id;
    private String name;

    public Employee(String id, String name) {
        super();
        this.id = id;
        this.name = name;
    }

    public Employee() {
        super();
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
    public abstract void work();
}
