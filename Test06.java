package day01_10.day04;
/*
       案例：手机号屏蔽
       需求：以字符串形式从键盘接收一个手机号，将中间四位号码屏蔽
       最终效果为：156****2687

            (看视频后，Substring方法的调用  Substring中详解)
 */
import java.util.Scanner;

public class Test06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入电话号码：");

        String tell = sc.nextLine();
        String a = tell.substring(0, 3);
        String b = tell.substring(7);
        System.out.println(a + "****" + b);

    }
}
