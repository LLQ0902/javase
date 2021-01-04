package day01_10.day04;

import java.util.Scanner;

public class Test08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 1. 键盘录入一个字符串，用 Scanner 实现
        System.out.println("请输入字符串A：");
        String a = sc.nextLine();
        // 2. 替换敏感词
        String tmd = a.replace("TMD","***");
        // 3. 输出结果
        System.out.println(tmd);

        //char 类型也具有replace反法,使用方法一致，单引号。如下
        //System.out.println("请输入字符串B：");
        //String A = sc.nextLine();
        //String 艹 = A.replace('艹', '*');中文可以定义类名
        //System.out.println(艹);

    }

}
