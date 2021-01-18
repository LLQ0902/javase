package day01_10.day10.demo02;

public class Student extends Person{

    public Student(){
    }

    public Student(String name, int age) {
        super(name, age);//super(…)  -  访问父类构造方法
    }
    public void study(){
        System.out.println("好好学习，天天向上");
    }
}
