package day01_10.day05;

import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生信息：");
        String s = sc.nextLine();

        String[] split = s.split("，");//接收数据调用split切割成数组



        Student stu = new Student(split[0],split[1]);//创建对象


        System.out.println(stu.getName());
        System.out.println(stu.getAge());





    }
}
