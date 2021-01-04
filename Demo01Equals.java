package day01_10.day04;
//字符串的比较
public class Demo01Equals {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "ABC";
        String s3 = "abc";

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));

        System.out.println(s1.equalsIgnoreCase(s2));//不考虑大小写

    }
}
