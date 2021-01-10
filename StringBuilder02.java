package day01_10.day07;

public class StringBuilder02 {
    /*
      StringBuilder:可变的字符串，可以看作是一个容器

      构造方法：
        public StringBuilder():创建一个空白可变的字符串对象，不含有任何内容
        public StringBuilder(String str):根据字符串的内容，来创建可变字符串对象

        打印String字符串对象和StringBuilder对象都会出现元素内容，而不会出现内存地址
     */
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();
        System.out.println(sb);

        StringBuilder sb2 = new StringBuilder("abc");
        System.out.println(sb2);
    }
}
