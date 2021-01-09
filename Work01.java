package day01_10.day06;
/*
1、定义一个方法
		public static ? print(int[] arr)
		功能：遍历数组所有元素
 */
public class Work01 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6};
        print(arr);
    }
    public static void print(int [] arr){
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
