package day01_10.day05;

public class Demo01 {
    public static void main(String[] args) {
        int count = 0;
        double p = 0.1;
        double z = 8844430;

        while (p < z) {
            p *= 2;
            count++;
        }
        System.out.println(count);
    }
}
