package day11_20.day13.demo01;

/**
 * @author 小小刘
 * @date 2020/12/5 11:50
 */
public class AnimalDemo {
    public static void main(String[] args) {

        //多态
        Animal a = new Cat();
        a.eat();
        a.setName("小橘");
        a.setAge(3);
        System.out.println(a.getName()+","+a.getAge());
        ((Cat) a).jump();


        System.out.println("------------");
        Jumpping j = new Cat();
        j.jump();
        ((Cat) j).eat();

        System.out.println("------------");
        Cat b = new Cat();
        b.eat();
        b.jump();
    }
}
