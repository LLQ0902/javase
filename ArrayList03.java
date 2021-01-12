package day01_10.day08;
//创建一个存储字符串集合
// 存储3个字符串元素，使用程序实现在控制台遍历该集合

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList03 {
    public static void main(String[] args) {
        //创建集合对象
        ArrayList<String> list = new ArrayList<>();
        //键盘录入字符串对象
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入第" + (i + 1) + "个字符串元素");
            list.add(sc.nextLine());
        }
        //遍历集合
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            System.out.println(s);

        }


    }
}
