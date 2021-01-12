package day01_10.day08;
//定义一个方法，方法接收一个集合对象（泛型为Student）
// 方法内部将年龄低于18的学生对象找出并存入新的集合对象，方法返回集合。
import day01_10.day04.Student;

import java.util.ArrayList;

public class ArrayList09 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        Student s1 = new Student("张三", 23);
        Student s2 = new Student("李四", 14);
        Student s3 = new Student("王五", 25);
        Student s4 = new Student("赵六", 16);

        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);

        System.out.println(a(list));

        //遍历调用方法返回的数组；A(list)是一个泛型为学生类的集合
        for (int i = 0; i <a(list).size() ; i++) {
            Student stu = a(list).get(i);
            System.out.println(stu.getName()+"...."+stu.getAge());
        }
    }

    public static ArrayList<Student> a( ArrayList<Student> list){//定义方法，传入泛型为学生类集合，筛选
        ArrayList<Student> list1 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            Student s = list.get(i);
           if(s.getAge() < 18){
               list1.add(s);
            }
        }
        return list1;
    }

}
