package day01_10.day07;
//String和StringBuilder运行效率比较
//StringBuilder比较快
public class StringBuilder01 {
    public static void main(String[] args) {

        
        long start = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= 50000; i++) {
           sb.append(i);
        }
        System.out.println(sb);
        //System.currentTimeMillis();获取1970年1月1日 0时0分0秒 到当前时间所经历过的毫秒值
        long end = System.currentTimeMillis();

        System.out.println(end - start);
    }

    private static void method() {
        long start = System.currentTimeMillis();

        String s = "";

        for (int i = 0; i <= 50000; i++) {
            s += i;
        }
        System.out.println(s);

        long end = System.currentTimeMillis();

        System.out.println(end - start);
    }

}
