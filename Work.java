package day01_10.day05;

import java.util.Scanner;

/*
分析以下需求，并用代码实现
1.键盘录入6个int类型的数据存数数组arr中
2.将arr数组中的内容反转
3.将反转后的数组索引为奇数的互相交换 1和3换, 3和5换,以此类推
4.最后将数组最后一个索引为奇数的元素 和数组中第一个索引为奇数的元素交换
5.打印最终的数组(实现了 1-4 步之后的数组)
6.如：用户输入的6个int数字为[1,2,3,4,5,6],最后输出的结果为[6, 5, 4, 1, 2, 3]
 */
public class Work {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[6];
        for (int i = 0; i < arr.length; i++) {  //赋值数组
            System.out.println("请输入第" + (i + 1) + "个元素");
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {   //将arr数组中的内容反转
            if (arr.length - 1 - i > i) {
                int tem = arr[i];
                arr[i] = arr[arr.length - 1 - i];
                arr[arr.length - 1 - i] = tem;
            } else {
                break;
            }
        }
        System.out.println("反转后的数组：");
        re(arr);

        int e;
        for (int i = 0; i < arr.length; i++) {
            if (i > arr.length - 3) {

            } else if (i % 2 != 0) {
                e = arr[i];
                arr[i] = arr[i + 2];
                arr[i + 2] = e;
            }
        }
        System.out.println("反转后索引为奇数的互相交换后的数组：");
        re(arr);

        int c = 0;
        lo:
        for (int i = 0; i < arr.length; i++) {
            if ((arr.length - 1) % 2 == 0) {//判断数组个数，
                                             // 好决定倒数第一个还是倒数第二个是最后一个基数索引
                if (i % 2 != 0) {
                    c = arr[i];
                    arr[i] = arr[arr.length - 2];
                    arr[arr.length - 1] = c;
                }

            } else {
                if (i % 2 != 0) {
                    c = arr[i];
                    arr[i] = arr[arr.length - 1];
                    arr[arr.length - 1] = c;
                    break lo;    //结束当前标记的for循环
                }
            }
        }
        System.out.println("最终结果：");
        re(arr);

    }

    public static void re(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {//打印最终结果
            if (i >= arr.length - 1) {
                System.out.println(arr[i] + "]");
            } else {
                System.out.print(arr[i] + ", ");
            }
        }


    }
}
