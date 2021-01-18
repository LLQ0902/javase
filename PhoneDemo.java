package day01_10.day10.demo03;
//测试类
public class PhoneDemo {
    public static void main(String[] args) {
        Phone p = new Phone();
        p.call("刘亦菲");

        System.out.println("--------");
        NewPhone np = new NewPhone();
        np.call("吴彦祖");
    }
}
