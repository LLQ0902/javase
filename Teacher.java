package day11_20.day12.demo01;

/**
 * @author 小小刘
 * @date 2020/12/4 19:01
 */
/*
  ①定义老师类(姓名，年龄，教书())

  ②定义学生类(姓名，年龄，学习())

  ③定义测试类，写代码测试

  ④共性抽取父类，定义人类(姓名，年龄)

  ⑤定义老师类，继承人类，并给出自己特有方法：教书()

  ⑥定义学生类，继承人类，并给出自己特有方法：学习()

  ⑦定义测试类，写代码测试
 */
public class Teacher extends Person{
    public Teacher(){}
    public Teacher(String name,int age){
        super(name,age);
    }

    public void teach(){
        System.out.println("教书");
    }

}
