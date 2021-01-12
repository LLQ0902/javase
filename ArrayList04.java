package day01_10.day08;
//创建一个存储学生对象的集合，存储3个学生对象，使用程序实现在控制台遍历该集合

import day01_10.day07.Student;

import java.util.ArrayList;


public class ArrayList04 {
    public static void main(String[] args) {
        //创建集合对象
        ArrayList<Student> list = new ArrayList<>();
        //创建学生对象
        Student s1 = new Student("张三", "23");
        Student s2 = new Student("张四", "23");
        Student s3 = new Student("张五", "23");
        //键盘录入字符串对象


        list.add(s1);
        list.add(s2);
        list.add(s3);


        for (int i = 0; i < list.size(); i++) {
            Student st = list.get(i);
            System.out.println(st.getName()+"...."+st.getAge());

        }
    }
}
