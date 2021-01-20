package day11_20.day13.demo03;

/**
 * @author 小小刘
 * @date 2020/12/5 21:08
 */
public class BasketballAthlete extends Athlete {
    public BasketballAthlete() {
    }

    public BasketballAthlete(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("篮球运动员学习篮球");
    }

    @Override
    public void eat() {
        System.out.println("篮球运动员吃饭");
    }
}
