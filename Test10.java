package day01;

public class Test10 {
    public static void main(String[] args) {
        print(10,20);

    }

    public static void print(int n,int m) {
        for (int i = n; i <m ; i++) {
            if(i%2 != 0){
                System.out.println(i);
            }

        }

    }
}
