package day01;

public class Test01 {
    public static void main(String[] args) {
        int[] arr = {11,22,33,44};

        //数组名.length
        System.out.println("arr数组中元素的个数为"+ arr.length);

        //for(int i = 0;i<5;i++){     手动写死了，不严谨，不推荐
        for(int i = 0;i<arr.length;++i){

            System.out.println(arr[i]);
        }



    }
}
