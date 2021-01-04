package day01_10.day04;

import java.util.Scanner;

public class Test03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入：");
        String s = sc.nextLine();

        //遍历字符串方法二
        char [] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);

        }
    }
}
