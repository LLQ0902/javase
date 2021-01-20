package day11_20.day13.demo03;

/**
 * @author 小小刘
 * @date 2020/12/5 21:06
 */
public class BasketballCoach extends Coach {
    public BasketballCoach() {
    }

    public BasketballCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("篮球教练教篮球");
    }

    @Override
    public void eat() {
        System.out.println("篮球教练吃饭");
    }
}
