package day02;

//反转
public class Test05 {
    public static void main(String[] args) {
        int[] arr = {19, 28, 37, 46, 50};

        for (int i = 0; i < arr.length; i++) {
            if (arr.length - 1 - i > i) {
                int tem = arr[i];
                arr[i] = arr[arr.length - 1 - i];
                arr[arr.length - 1 - i] = tem;
            }else{
                break;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+" ");

        }
    }

}
