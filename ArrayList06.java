package day01_10.day08;
//创建一个存储String的集合，内部存储（test，张三，李四，test，test）字符串
//删除所有的test字符串，删除后，将集合剩余元素打印在控制台
import java.util.ArrayList;

public class ArrayList06 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("test");
        list.add("张三");
        list.add("李四");
        list.add("test");
        list.add("test");

        System.out.println(list);
//注意，这里我这个方法只改变了输出，没改变内部存储的String集合
//具体删除方法，ArrayList08
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals("test")) {
                continue;
            }
            System.out.println(list.get(i));
        }
        System.out.println(list);
    }
}
