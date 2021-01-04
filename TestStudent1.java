package day01_10.day03;

public class TestStudent1 {
    public static void main(String[] args) {
        Student1 stu = new Student1();
        stu.setName("张三");
        stu.setAge(23);

        System.out.println(stu.getName());
        System.out.println(stu.getAge());

        int age = stu.getAge();

        for(int i = 1;i <= age;i++){
            System.out.println("生日快乐");
        }

        stu.show();
    }
}
