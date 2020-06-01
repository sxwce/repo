package com.hkx.students;

import java.util.List;
import java.util.Scanner;

/**
 * 信息的crud操作
 */
public class Method {

    /**
     * 判断是否有重复的学号
     * @param arr
     * @param sid
     * @return
     */
    public static Boolean panduan(List<Student> arr,String sid){
    Boolean flag = false;
        for (int i = 0; i < arr.size(); i++) {
            Student s =  arr.get(i);
            if (s.getSid().equals(sid)){
                flag = true;
                break;
            }
        }
        return flag;
    }

    /**
     * 添加
     * @param arr
     */
    public static void addStudent(List<Student> arr){
        Scanner sc = new Scanner(System.in);
        String sid;

        //判断是否有相同的学号
        while (true){
            System.out.println("请输入学生学号");
            sid = sc.nextLine();
            boolean flag = panduan(arr, sid);
            if (flag) {
                System.out.println("学号被注册了，重新输入");
            } else {
                break;
            }
        }

        //输入学生信息
        System.out.println("请输入学生姓名");
        String name = sc.nextLine();
        System.out.println("请输入学生年龄");
        String age = sc.nextLine();
        System.out.println("请输入学生居住地");
        String address = sc.nextLine();

        //创建一个学生对象
        Student s = new Student();
        s.setSid(sid);
        s.setName(name);
        s.setAge(age);

        //添加到集合中
        arr.add(s);
        System.out.println("添加学生成功");
    }

    /**
     * 删除
     * @param arr
     */
    public static void deleteStudent(List<Student> arr){

        System.out.println("请输入删除学生的学号");
        Scanner sc = new Scanner(System.in);
        String sid = sc.nextLine();
        int index = -1;
        for (int i = 0; i < arr.size(); i++) {
            Student s =  arr.get(i);
            //将数组的学号和输入的学号进行比较
            if(s.getSid().equals(sid)) {
                index = i;
                break;
            }
        }
        if(index == -1) {
            System.out.println("要删除的学号不存在,请重新选择");
        }else {
            arr.remove(index);
            System.out.println("删除成功");
        }
        
    }

    /**
     * 修改
     * @param arr
     */
    public static void updateStudent(List<Student> arr){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你要修改的学生的学号：");
        String id = sc.nextLine();
        int index = -1;

        //遍历集合
        for(int x=0; x<arr.size(); x++) {
            Student s = arr.get(x);

            //学生学号和输入的学号进行比较
            if(s.getSid().equals(id)) {
                index = x;
                break;
            }else {
                System.out.println("输入新姓名：");
                String name = sc.nextLine();
                System.out.println("输入新年龄：");
                String age = sc.nextLine();
                System.out.println("输入新居住地：");
                String address = sc.nextLine();

                //创建学生对象
                Student stu = new Student();
                stu.setSid(id);
                stu.setName(name);
                stu.setAge(age);
                stu.setAddress(address);
                //修改集合中的学生的信息
                arr.set(index, stu);
                System.out.println("修改学生成功");
            }
        }
    }

    /**
     * 查询
     * @param arr
     */
    public static void findAllStudent(List<Student> arr){

        //判断集合里是否有数据
        if (arr.size() == 0) {
            System.out.println("无信息，请先添加信息后再次查询");
            return;
        }

        //打印学生信息
        System.out.println("学号    姓名    年龄    居住地");
        for (int i = 0; i < arr.size(); i++) {
            Student s = arr.get(i);
            System.out.println(s.getSid() + "   " + s.getName() + "   " + s.getAge() + "岁   " + s.getAddress());
        }
    }
}
