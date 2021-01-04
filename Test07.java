package day01_10.day04;
//键盘录入字符串，包含TMD则使用***代替

import java.util.Scanner;

public class Test07 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串");

        String a = sc.nextLine();

        char[] chars = a.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (i <= chars.length - 3) {   //索引越界问题    if(i >chars.length-3)

                if (chars[i] == 'T' & chars[i + 1] == 'M' & chars[i + 2] == 'D') {

                    chars[i] = '*';
                    chars[i + 1] = '*';
                    chars[i + 2] = '*';
                }
            }
            System.out.print(chars[i]);
        }

    }
}
