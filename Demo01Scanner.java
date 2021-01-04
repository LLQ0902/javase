package day01_10.day04;
import java.util.Scanner;
public class Demo01Scanner {
    /*
        nextInt():只可以接受录入int类型,只接收一个数据，即空格后也不在录入

        next():遇到空格，就不再录入数据了

            结束标记：空格，tab

        nextLine（）：可以将数据完整的接收过来

            结束标记：回车换行符

     */

    public static void main(String[] args) {
        //创建Scanner对象
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入");
        //调用nextLine方法接收字符串
        //ctrl+ alt+v;快速生成方法的返回值
        String s = sc.nextLine();

        System.out.println(s);
    }
}
