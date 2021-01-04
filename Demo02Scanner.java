package day01_10.day04;

import java.util.Scanner;

public class Demo02Scanner {
    /*
        nextInt和nextLine方法配合使用的时候，nextLine方法就没有键盘录入的机会了

        建议：今后键盘录入数据的时候，如果是字符串和整数一起接收，建议使用next方法进行接收字符串
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //System.out.println("请输入字符串：");     nextLine方法在前先录入即可
        //String s = sc.nextLine();
        System.out.println("请输入整数：");
        int num = sc.nextInt();
        System.out.println("请输入字符串：");
        String s1 = sc.nextLine();

        System.out.println(num);
        System.out.println(s1);
    }

}
