package day01;

import java.util.Scanner;
//数组求和
public class Test03 {
    public static void main(String[] arge){
        //创建键盘录入对象，准备键盘录入
        Scanner sc = new Scanner(System.in);
        //定义一个求和变量，准备记录累加后的结果
        int sum = 0;
        //动态初始化一个长度为5的int数组，准备存储键盘录入的数值
        int[]arr = new int[5];
        //将键盘录入的数值存储到数组中
        for(int i = 0;i < arr.length ;i++){
            System.out.println("请输入第"+(i+1)+"个整数");
            //arr[i] = 10;
            arr[i] = sc.nextInt();
        }
        //遍历数组，取出每一个元素，并求和
        for(int i = 1;i<arr.length;i++){
            sum += arr[i];
        }
        //输出总和
        System.out.println("sum:"+sum);
    }
}
