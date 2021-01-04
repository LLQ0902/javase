package day01_10.day04;
/*
       案例：手机号屏蔽
       需求：以字符串形式从键盘接收一个手机号，将中间四位号码屏蔽
       最终效果为：156****2687


 */

import java.util.Scanner;

public class Test05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入手机号码：");
        String s = sc.nextLine();

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length ; i++) {
            if(i<3 || i>6){
                System.out.print(chars[i]);
            }else{
                System.out.print("*");
            }
        }
    }
}
