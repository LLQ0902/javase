package day01_10.day06;

/*
2.定义一个方法
		public static ? fill(int[] arr,int value)
		功能:将数组arr中的所有元素的值改为value
		比如:
			调用方法如下 fill(arr , 23);
			最终遍历数组,该数组里的元素都是 23
 */
public class Work02 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6};
        fill(arr, 23);
    }
    public static void fill(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = value;
            System.out.print(arr[i] + " ");
        }
    }
}
