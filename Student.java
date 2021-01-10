package day01_10.day07;
/*

 */
public class Student {
    private  String name = "小圈";
    private String age;

    public Student(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public Student() {
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
