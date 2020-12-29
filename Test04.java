package day02;

//设计一个方法，该方法可以同时获取数组的最大值和最小值
public class Test04 {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55};
        int[] a = num(arr);
        System.out.println(a[0]);
        System.out.println(a[1]);

    }

    public static int[] num(int[] arr) {
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
        int[] maxAndMin = {min, max};
        return maxAndMin;
    }
}
