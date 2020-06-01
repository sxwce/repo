package com.hkx.students;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentMessage {
    public static void main(String[] args) {

        //实例化Method类
        Method m = new Method();

        //创建集合的对象，用于存储学生的信息
        List<Student> arr = new ArrayList<Student>();
        while (true) {
            System.out.println("--------欢迎进入学生管理系统--------");  
            System.out.println("1  添加学生");                             
            System.out.println("2  删除学生");
            System.out.println("3  修改学生");
            System.out.println("4  查看所有学生");
            System.out.println("5  退出");
            System.out.println("请输入你的选择：");

            //输入键盘录入信息
            Scanner sc = new Scanner(System.in);      
            String line = sc.nextLine();

            switch (line) {                          
                case "1":                            
                    // System.out.println("添加");
                    m.addStudent(arr);
                    break;
                case "2":
                    //System.out.println("删除");
                    m.updateStudent(arr);
                    break;
                case "3":
                    //System.out.println("修改");
                    m.deleteStudent(arr);
                    break;
                case "4":
                    //System.out.println("查看所有");
                    m.findAllStudent(arr);
                    break;
                case "5":
                    System.out.println("谢谢惠顾");
                    System.exit(0);
                default:
                    System.out.println("输入有误，重入");
            }
        }
    }
    
}
