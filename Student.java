package day01_10.day05;

public class Student {
    private String name;
    private String age;


    public Student(String name, String age) {
        this.name = name;
        this.age = age;
        //构造方法
    }
        //空参构造方法
    public Student(String name, int age) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
