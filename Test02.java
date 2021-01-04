package day01_10.day04;

import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入：");
        String s = sc.nextLine();

        //遍历字符串方法一
        for (int i = 0; i <s.length() ; i++) {
            char c = s.charAt(i);//就是指定索引处的字符值

            System.out.println(c);
        }


    }
}
