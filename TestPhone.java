package day01_10.day03;

public class TestPhone {
    public static void main(String[] args) {
        //创建对象
        Phone p = new Phone();
        //给成员变量赋值
        p.brand = "小米";
        p.price = 4999;
        //打印赋值后的成员变量
        System.out.println(p.brand + "..."+ p.price);
        //调用成员方法
        p.call("阿强");
        p.sendMessage();


    }
}
