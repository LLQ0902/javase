package day01_10.day09;
//技师类
/**
 * @author 小小刘
 * @date 2020/12/9 10:47
 */
public class JiShi {
    private String sid;     // 工号
    private String name;    // 姓名
    private int age;        // 年龄
    private String birthday; // 生日

    public JiShi() {
    }

    public JiShi(String sid, String name, int age, String birthday) {
        this.sid = sid;
        this.name = name;
        this.age = age;
        this.birthday = birthday;
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
