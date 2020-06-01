package com.hkx.no2.demo5;

public class Buyer extends AdminStaff {
    public Buyer(String id, String name) {
        super(id, name);
    }

    public Buyer() {
    }

    @Override
    public void work() {
        System.out.println("工号为 "+this.getId()+" 的采购专员 "+getName()+" 在采购音响设备");
    }
}
