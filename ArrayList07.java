package day01_10.day08;

import java.util.ArrayList;

//创建一个存储String的集合，内部存储（test，张三，李四，test，test）字符串
//删除所有的test字符串，删除后，将集合剩余元素打印在控制台
public class ArrayList07 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("test");
        list.add("张三");
        list.add("李四");
        list.add("test");
        list.add("test");

//注意，根据元素进行删除每次只能够删除一个，且是从前往后删。
        list.remove("test");
        list.remove("test");
        list.remove("test");

//根据索引进行删除每次也只能够删除一个
//并且每次删除后索引会重新计算
        //list.remove(0);
        //list.remove(2);
        //list.remove(2);

        for (int i = 0; i < list.size(); i++) {

            System.out.println(list.get(i));
        }
    }
}
