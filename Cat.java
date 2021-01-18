package day11_20.day11.factory;

/**
 * @author 小小刘
 * @date 2020/12/16 16:36
 */
public class Cat extends Animal{


    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    public void jump(){
        System.out.println("猫跳高");
    }
}
