package day01_10.day05;
/*
第一题:	分析以下需求并实现
	1.键盘录入一个数据作为数组的长度
	2.请使用随机数[1,10}给数组赋值
	3.再次键盘录入一个数据,统计这个数在该数组中出现的次数
	例如:
		数组的元素为: {1,2,5,1}
		要找的数为:1
		最终控制台打印的结果为: 1 在数组里出现的次数为 2 次
第二题: 分析以下需求并实现
	键盘录入一个数，判断这个数是否在数组中,如果存在就打印该元素的索引,不存在
	请打印-1 (注意:如果有多个,请打印第一个元素的索引)        //代码中加入berak跳出在稍作修改即可，这里我打印了所有的索引
	例如: 数组里有{9,5,2,7,7} ,假如要找的元素为 7, 那么它的索引应该为 3
 */


import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数组长度：");
        int arr[] = new int[sc.nextInt()];
        int count = 0;
        Random ra = new Random();
        System.out.println("请输入需统计在随机数组中出现次数以及需要打印每次索引的的数据：");
        int a = sc.nextInt();
        ArrayList list = new ArrayList();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ra.nextInt(10) + 1;
            if (i == arr.length - 1) {                   //简单把数组单行加空格打印在一行，方便后面对照数据
                System.out.println(arr[i]);
            } else {
                System.out.print(arr[i] + " ");
            }
            if (arr[i] == a) {
                list.add(i);//不可知长度，定义集合接收
                count++;
            }
        }
        if (count == 0) {
            System.out.println(a + "在数组里出现的次数为" + count + "次，索引为默认值-1");
        }else{
            System.out.println(a + "在数组里出现的次数为" + count + "次，索引为" + list);
        }
    }
}
