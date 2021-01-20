package day11_20.day13.demo03;

/**
 * @author 小小刘
 * @date 2020/12/5 20:55
 */
public abstract class Athlete extends Person{
    public Athlete() {
    }

    public Athlete(String name, int age) {
        super(name, age);
    }
    public abstract  void study();
}
