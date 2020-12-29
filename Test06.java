package day02;
//反转
public class Test06 {
    public static void main(String[] args) {
        int [] arr = {19,28,37,46,50};
        for(int star=0,end = arr.length-1;end>star;star++,end--){
            int tem = arr [star];
            arr [star] = arr [end];
            arr [end] = tem;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

    }
}
