package day01;

import java.util.Scanner;

//评委打分，尝试不看视频解说自己打代码
public class Test06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[6];
        int max = 0;
        int min = 100;
        int sum = 0;
        int p;

        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第" + (i + 1) + "个分数");
            int f = sc.nextInt();
            arr[i] = f;
            sum += arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }

        }
        p = (sum - min - max) / 4;
        System.out.println("平均分是：" + p);
    }
}
