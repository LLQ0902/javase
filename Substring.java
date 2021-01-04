package day01_10.day04;

public class Substring {
    /*
    截取字符串：
            String substring(int beginIndex);
                从传入的索引位置处，向后截取，一直截取到末尾，得到新的字符串并返回

             String substring(int beginIndex， int endIndex);
                 从beginIndex索引位置开始截取，截取到endIndex索引位置
                 得到新字符串并返回（包含头，不包含尾）
     */

    public static void main(String[] age){
        String s = "superman";

        String a = s.substring(0,5);
        String b = s.substring(5);

        System.out.println(a);//super
        System.out.println(b);//man
    }
}
