package day01_10.day07;

import java.util.Scanner; 

//需要键盘接收一个字符串，程序判断出该字符串是否是对称字符串，并且在控制台打印是或者不是
//对称字符串：123321、111
//非对称字符串123123

// StringBuilder s = new StringBuilder(String类型字符串);  String----->StringBuilder
//String s = sb.toString();   StringBuilder----->String
public class StringBuilder04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串：");
        String s = sc.nextLine();
        //有参定义StringBuilder,参数为输入的String类型字符串
        StringBuilder sb = new StringBuilder(s);

        //反转前，把StringBuilder类型字符串转换成String类型字符串，因为String类型不可改变
        String a = sb.toString();

        sb.reverse();//反转StringBuilder字符串

        //反转前，把StringBuilder类型字符串转换成String类型字符串，因为String类型不可改变
        String b = sb.toString();

        System.out.println(a.equals(b));//调用equals方法判断a字符串和b字符串是否相等，直接输出
    }
}
