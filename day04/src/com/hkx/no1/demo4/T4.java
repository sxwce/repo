package com.hkx.no1.demo4;

public class T4 {

    private String userName;
    private String password;

    public T4() {
    }

    public T4(String userName, String password) {
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
