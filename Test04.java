package day01_10.day04;

import java.util.Scanner;

public class Test04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串：");
        String s = sc.nextLine();

        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;

        //ctrl + alt + v   快速创建类接收方法返回值
        char[] chars = s.toCharArray();

        //char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            //char d = chars[i];

            if (chars[i] >= 'A' && chars[i] <= 'Z') {
                a++;
            }else if(chars[i] >= 'a' && chars[i] <= 'z'){
                b++;
            }else if(chars[i] >= '0' && chars[i] <= '9') {
                c++;
            }else{
                d++;
            }

        }
        System.out.println("输入的字符串中大写字母字符出现的次数为："+a);
        System.out.println("输入的字符串中小写字母字符出现的次数为："+b);
        System.out.println("输入的字符串中数字字符出现的次数为："+c);
        System.out.println("输入的字符串中其它字符出现的次数为："+d);


    }
}
