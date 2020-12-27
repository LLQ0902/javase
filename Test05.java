package day01;

import java.util.Scanner;
//输入数据，判断在不在数组中，在数组中输出索引
public class Test05 {
    public static void main(String []arge){
        int [] arr ={19,28,37,46,50};
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数据");

        int num = sc.nextInt();
        int index = -1;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]==num){
                index = i;
                break;
            }
        }
        System.out.println(index);

    }
}
