package day02;

public class Test08 {
    public static void main(String[] args) {
        int [] arr0 = {11,22,33};
        int [] arr1 = {44,55,66};
        int [] arr2 = {77,88,99};

        int [][] arr = new int [3][3];

        arr[2][3] = 100;

        arr[0] = arr0;
        arr[1] = arr1;
        arr[2] = arr2;


        System.out.println(arr[1][2]);

    }
}
