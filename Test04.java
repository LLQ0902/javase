package day01;
//数组求和
import java.util.Scanner;

public class Test04 {
   public static void main(String [] arge){
       Scanner sc = new Scanner(System.in);
       int [] arr = new int[5];
       int sum = 0;
       for(int i = 0;i<arr.length;i++){
           System.out.println("请输入第"+(i+1)+"个数");
           arr[i] = sc.nextInt();

       }
       for(int i = 0;i<arr.length;i++){
           sum += arr[i];

       }
       System.out.println("sum:"+sum);
   }
}
