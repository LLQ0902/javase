package day01_10.day06;

import java.util.Scanner;

/*
第二题:分析以下需求，并用代码实现
	1.键盘录入6个整数存入数组中
	2.定义一个方法将奇数放在数组的左侧,偶数放在数组的右侧
	3.定义一个方法打印原数组和处理后的数组
	4.定义一个方法传入一个int类型数组，输出这个数组中只出现一次的数字及个数
 */
public class Work06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];
        //1.键盘录入6个整数存入数组中
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第" + (i + 1) + "个元素");
            arr[i] = sc.nextInt();
        }
        int arr1[] = a(arr);
        print(arr);
        print(arr1);
        once(arr);
    }

    //2.定义一个方法将奇数放在数组的左侧,偶数放在数组的右侧
    public static int[] a(int[] arr) {
        int[] arr1 = new int[arr.length];
        int a = 0;
        int b = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                arr1[a] = arr[i];
                a++;
            } else {
                arr1[arr.length - 1 - b] = arr[i];
                b++;
            }
        }
        return arr1;
    }

    //3.定义一个方法打印原数组和处理后的数组
    public static void print(int[] arr1) {
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
    }

//4.定义一个方法传入一个int类型数组，输出这个数组中只出现一次的数字及个数
    public static void once(int[] arr) {
        //定义两个计数器
        int count = 0;
        int a = 0;
        System.out.println("数组中只出现一次的数字有：");
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            //出现一次的数，打印
            if(count == 1){
                System.out.print(arr[i]+" ");
                //记录出现了一次的数打印的次数
                a++;
            }
            //计数器归零，循环判断下一个数
            count = 0;
        }
        System.out.println();
        System.out.println("总共有"+a+"个");
    }
}
