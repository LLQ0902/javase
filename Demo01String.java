package day01_10.day04;

public class Demo01String {
    /*
        Java程序中，所以的双引号字符串，都是String这个类的对象

        字符串是常量；它的值在创建之后不能更改
     */

    public static void main(String[] args) {

        String s1 = "abc123";

        int length = s1.length();
        System.out.println(length);

        s1 = "der"; //这一步是让s1这个字符串类型的变量，记录了一个新的对象
        System.out.println(s1);

        /*
            Student stu = new Student("张三"，23)
            stu = new Student("李四"，23)；

            stu.setName("王五");
         */
    }
}

