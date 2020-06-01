package com.hkx.code_block;

public class jubu {

    int username=111;
    String password ="jeog";

    //成员类部类
    class user{
        String email;
        Integer phone;
        public void user(){
            System.out.println(username);
            System.out.println(password);
        }
    }

    public void pass(){
        class pwd{
            public void aaa(){
                System.out.println(username);
            }
        }
        pwd p = new pwd();
        p.aaa();
    }
}
