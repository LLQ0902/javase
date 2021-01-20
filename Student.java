package day11_20.day12.demo01;

/**
 * @author 小小刘
 * @date 2020/12/4 19:00
 */
public class Student extends Person{
    public Student(){}
    public Student(String name,int age){
        super(name, age);
    }
    public void study(){
        System.out.println("学习");
    }
}
