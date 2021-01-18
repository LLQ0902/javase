package day11_20.day11.factory;

/**
 * @author 小小刘
 * @date 2020/12/16 16:37
 */
public class Test {
    public static void main(String[] args) {
        Animal a1 = AnimalFactory.createAnimal(1);
        Animal a2 = AnimalFactory.createAnimal(2);
        Animal a3 = AnimalFactory.createAnimal(3);
        a1.eat();
        a2.eat();
        a3.eat();

        //a2转换为猫类，a2是Animal类
        ((Cat)a2).jump();
    }
}
