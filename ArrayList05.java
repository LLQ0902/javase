package day01_10.day08;
//创建一个存储学生对象的集合，存储3个学生对象，使用程序实现在控制台遍历该集合
//学生的姓名和年龄来自于键盘录入

import day01_10.day04.Student;//导学生类包，int age;String name;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList05 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        Student stu1 = getStudent(); //调用getStudent方法获取学生对象
        Student stu2 = getStudent();
        Student stu3 = getStudent();

        list.add(stu1); //集合添加学生类信息
        list.add(stu2);
        list.add(stu3);

        for (int i = 0; i < list.size(); i++) {
            Student s = list.get(i);//遍历获取学生类
            System.out.println(s.getName()+"...."+s.getAge());//打印展示
        }
    }


    private static Student getStudent() {//定义方法，键盘录入学生信息
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生对象的姓名：");
        String name = sc.nextLine();
        System.out.println("请输入学生对象的年龄：");
        int age = sc.nextInt();

        Student stu = new Student(name,age);//定义带参学生类，参数为以上键盘输入

        return stu;//返回学生类
    }
}
