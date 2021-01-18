package day01_10.day10.demo02;

public class Teacher extends Person{

    public Teacher() {
        super();//每一个子类构造方法的第一条语句默认都是：super();一般写
    }

    public Teacher(String name, int age) {
//        super();//每一个子类构造方法的第一条语句默认都是：super();
        super(name, age);//super(…)  -  访问父类构造方法
    }

    public void teach(){
        System.out.println("用爱成就每一位学生");
    }

}
