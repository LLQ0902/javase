package day01_10.day09;

public class Student {
    private String sid;
    private String name;
    private int age;
    private String birthday;

    public Student() {
    }

    public Student(String sid, String name, int age, String birthday) {
        this.sid = sid;//学号
        this.name = name;//姓名
        this.age = age;//年龄
        this.birthday = birthday;//生日
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
}
