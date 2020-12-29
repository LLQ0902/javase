package day02;

// 设计一个方法用于获取数组中元素的最大值
public class Test03 {

    public static void main(String[] arge) {
        //数据类型 变量名  =  值

        int[] arr = {11, 22, 33, 44, 55};
        int max = array(arr);
        System.out.println(array(arr));
    }

    public static int array(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++)
            if (arr[i] > max) {
                max = arr[i];
            }
        return max;
    }
}
