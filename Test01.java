package day02;

public class Test01 {
    public static void main(String[] args) {
        System.out.println(compare(178708906666608909L, 896980699987776L));
    }

    public static boolean compare(int a, int b) {
        return a == b;
    }

    public static boolean compare(long a, long b) {
        return a == b;
    }

    public static boolean compare(short a, short b) {
        return a == b;
    }

    public static boolean compare(byte a, byte b) {
        return a == b;
    }
}
