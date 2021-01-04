package day01_10.day04;

public class TestStudent {
    public static void main(String[] args) {
        //无参数构造方法创建对象，通过set方法给成员变量进行赋值
        Student s = new Student();
        //Random r = new Random();
        //int i = r.nextInt(10 );
        s.setName("张三");
        s.setAge(23);
        s.show();
        //通过带参数构造方法，直接给属性进行赋值
        Student s1 = new Student("李四",23);
        s1.show();

    }
}
