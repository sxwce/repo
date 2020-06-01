package com.hkx.no2.demo5;

public class Maintainer extends AdminStaff {
    public Maintainer(String id, String name) {
        super(id, name);
    }

    public Maintainer() {
    }

    @Override
    public void work() {
        System.out.println("工号为 "+this.getId()+" 的维护专员 "+getName()+" 在解决共享屏幕的问题");
    }
}
