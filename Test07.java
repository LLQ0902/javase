package day01;
//评委打分，6个分数，去最大最小，求平均
import java.util.Scanner;

public class Test07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第" + (i + 1) + "个分数");
            int f = sc.nextInt();
            if (f >= 0 && f <= 100) {
                arr[i] = f;
            } else {
                System.out.println("输入有误，请输入0~100的有效分数");
                i--;
            }
            sum += arr[i];
        }

        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        int avg = (sum - max - min) / 4;
        System.out.println("平均分为："+avg);
    }

}
