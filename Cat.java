package day11_20.day13.demo01;

/**
 * @author 小小刘
 * @date 2020/12/5 11:46
 */
public class Cat extends Animal implements Jumpping {
    public Cat(){}

    public Cat(String name,int age){
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    @Override
    public void jump() {
        System.out.println("猫跳高");
    }
}
