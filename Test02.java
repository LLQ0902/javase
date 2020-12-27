package day01;
//求数组最大值
public class Test02 {
    public static void main(String[] args) {
         int[] arr = {12,45,98,73,60};
         //假设数组中的第一个元素为最大值
        int max = arr[0];
        //遍历数组，获取每一个元素，准备进行比较
        for(int i = 1;i<arr.length;i++){
            //比较过程中，出现了比max更大的，让max记录更大的值
            if (arr[i]>max) {
                max = arr[i];
            }
        }
        System.out.println("max:"+max);
    }





}
