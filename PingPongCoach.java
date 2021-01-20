package day11_20.day13.demo03;

/**
 * @author 小小刘
 * @date 2020/12/5 20:57
 */
public class PingPongCoach extends Coach implements English{
    public PingPongCoach() {
    }

    public PingPongCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("乒乓球教练教乒乓球");
    }

    @Override
    public void eat() {
        System.out.println("乒乓球教练吃饭");
    }

    @Override
    public void studyEnglish() {
        System.out.println("乒乓球教练学英语");
    }
}
