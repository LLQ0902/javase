package day02;
//二维数组
public class Test07 {
    public static void main(String[] args) {

        int[][] arr = new int [3][3];
        /*

        [[I@1b6d3586
        @：分隔符
        1b6d3586：十六进制内存地址
        I:数组中存储的数据类型
        [[：几个中括号表示是几维数组
         */

        //二维数组存储一维数组的时候，存储的是一维数组的内存地址
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        //输出二维数组中的第一个一维数组中的元素
        System.out.println(arr[0][0]);
        System.out.println(arr[0][1]);
        System.out.println(arr[0][2]);

        //向二维数组中存储元素
        arr[0][0] = 11;
        arr[0][1] = 12;
        arr[0][2] = 13;

        arr[1][0] = 11;
        arr[1][1] = 12;
        arr[1][2] = 13;

        arr[2][0] = 11;
        arr[2][1] = 12;
        arr[2][2] = 13;

        //从二维数组中取出元素并打印
        System.out.println(arr[0][0]);
        System.out.println(arr[0][1]);
        System.out.println(arr[0][2]);

        System.out.println(arr[1][0]);
        System.out.println(arr[1][1]);
        System.out.println(arr[1][2]);

        System.out.println(arr[2][0]);
        System.out.println(arr[2][1]);
        System.out.println(arr[2][2]);
    }

}
