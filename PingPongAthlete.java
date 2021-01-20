package day11_20.day13.demo03;

/**
 * @author 小小刘
 * @date 2020/12/5 21:01
 */
public class PingPongAthlete extends Athlete implements English {
    public PingPongAthlete() {
    }

    public PingPongAthlete(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("乒乓球运动员学习乒乓球");
    }

    @Override
    public void studyEnglish() {
        System.out.println("乒乓球运动员学习英语");
    }

    @Override
    public void eat() {
        System.out.println("乒乓球运动员吃饭");
    }
}
