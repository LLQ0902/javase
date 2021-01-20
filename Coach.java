package day11_20.day13.demo03;

/**
 * @author 小小刘
 * @date 2020/12/5 20:52
 */
public abstract class Coach extends Person{
    public Coach() {
    }

    public Coach(String name, int age) {
        super(name, age);
    }
    public abstract void teach();
}
