package day01_10.day06;
/*
	5.定义一个方法
		public static ? equals(int[] arr,int value)
		功能:找value里的值在数组中的索引,如果没有找到请返回 -1
 */
public class Work05 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7};
        int i = equals(arr, 4);
        System.out.println(i);
    }
    public static int equals(int[] arr, int value) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                index = i;
            }
        }
        return index;
    }
}
