package day01_10.day06;
/*
3.定义一个方法
		public static ? equals(int[] arr1,int[] arr2)
		功能:比较两个数组是否相等(长度和内容均相等则认为两个数组是相同的
 */
public class Work03 {
    public static void main(String[] args) {
        int [] arr1 = {1,2,3,4,5,6};
        int [] arr2 = {1,2,3,4,5,6,7};
        int [] arr3 = {1,2,3,4,5,6};
        boolean equals = equals(arr1, arr3);
        System.out.println(equals);
    }
    public static boolean equals(int[] arr1,int[] arr2){
        boolean c = false;
        if(arr1.length == arr2.length){
            for (int i = 0; i < arr1.length; i++) {
                if(arr1[i] == arr2[i]){
                    c =true;
                }else{
                    return c;
                }
            }
        }
        return  c;
    }
}
