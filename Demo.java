package day01_10.day10.demo02;
//测试类
//规则：子类中所有的构造方法默认都会访问父类中无参的构造方法
public class Demo {
    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        t1.setName("刘亦菲");
        t1.setAge(24);
        System.out.println(t1.getName()+"...."+t1.getAge());
        t1.teach();

        Teacher t2 = new Teacher("朱茵",25);
        System.out.println(t2.getName()+"...."+t2.getAge());
        t2.teach();


        Student s1 = new Student();
        s1.setName("陈冠希");
        s1.setAge(24);
        System.out.println(s1.getName()+"....."+s1.getAge());
        s1.study();

        Student s2 = new Student("吴彦祖",26);
        System.out.println(s2.getName()+"...."+s2.getAge());
        s2.study();
    }
}
