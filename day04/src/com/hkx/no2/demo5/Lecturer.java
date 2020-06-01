package com.hkx.no2.demo5;

public class Lecturer extends Teacher {
    public Lecturer(String id, String name) {
        super(id, name);
    }

    public Lecturer() {
    }

    @Override
    public void work() {
        System.out.println("工号为 "+this.getId()+" 的讲师 "+getName()+" 在讲课");
    }
}
