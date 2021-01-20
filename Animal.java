package day11_20.day13.demo01;
/*
需求：对猫和狗进行训练，他们就可以跳高了，
      如果这里加入跳高功能，请采用抽象类和接口来实现猫狗案例
      并在测试类中进行测试
 */
/**
 * @author 小小刘
 * @date 2020/12/5 11:50
 */
public abstract class Animal {
    private String name;
    private  int age;

    public Animal() {
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract void eat();
}
