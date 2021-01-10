package day01_10.day07;
//定义一个方法，把int数组中的数据按照指定的格式拼接成一个字符串返回，调用该方法，并在控制台输出结果
//例如，int[]arr={1,2,3};执行方法后的输出结果为：[1,2,3]
//数组长度，数组元素，手动输入
import java.util.Scanner;

public class StringBuilder05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入第数组长度");
        int[]arr = new int[sc.nextInt()];
        for(int i = 0;i < arr.length ;i++){
         System.out.println("请输入第"+(i+1)+"个整数");
         arr[i] = sc.nextInt();
        }
        StringBuilder a = a(arr);     //String A = A(arr);
        System.out.println(a);
    }
    public static StringBuilder a(int[] arr) {   //public static String A(int[] arr) {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length - 1) {
                sb.append(arr[i] + ", ");
            } else {
                sb.append(arr[i] + "]");
            }
        }
        return sb;//return sb.toString();
    }
}
