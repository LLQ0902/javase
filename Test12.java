package day01;
//结论：
//对于引用类型的参数，形式参数的改变，影响实际参数的值
//结论依据：
//引用数据类型的传参，传入的是地址值，内存中会造成两个引用指向同一个内存的效果，所以即使方法
//弹栈，堆内存中的数据也已经是改变后的结果

//想测试String,因为String也是引用数据类型，但是测试不成功   之后学了StringBuilder,操作成功
//因为String内容不可变，StringBuilder内容可变
//import java.util.Scanner;

public class Test12 {
    public static void main(String[] args) {
       StringBuilder s = new StringBuilder("abc");

        System.out.println(s);
       change(s);
        System.out.println(s);
        }

    public static void change(StringBuilder s){
        s.append(123);
    }
}

