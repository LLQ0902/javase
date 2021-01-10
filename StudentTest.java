package day01_10.day07;
//out+回车，导包,如果Student类不在同一个包下，则需要此操作。
/*
   需求：将（张三，23）（李四，24）（王五，25）封装为3个学生对象
   并存入数组，随后遍历数组，将学生信息输出给控制台

   思路：
    1.定义学生类准备用于封装数据
    2.动态初始化长度为三的数组，类型为Student类型
    3.根据需求创立3个学生对象
    4.将学生对象存入数组
    5.遍历数组，取出每一个学生对象
    6.调用对象的getXxx方法获取学生信息



 */
public class StudentTest {
    public static void main(String[] args) {

        Student [] arr = new Student [3];

        Student s1 = new Student ("张三","23");
        Student s2 = new Student ("李四","24");
        Student s3 = new Student ("王五","25");

        arr[0] = s1;
        arr[1] = s2;
        arr[2] = s3;

        for (int i = 0; i <arr.length ; i++) {
            Student temp = arr[i];
            System.out.println(temp.getName()+"....."+temp.getAge());

        }
    }
}
