package com.hkx.no1.demo3;

public class T3 {
    private String userName;
    private String password;

    public T3() {
    }

    public T3(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public void user(){
        System.out.println("用户名"+userName+" 密码"+password);
    }
}
