package day01_10.day08;
//创建一个存储String的集合，内部存储（test，张三，李四，test，test）字符串
//删除所有的test字符串，删除后，将集合剩余元素打印在控制台
import java.util.ArrayList;

public class ArrayList08 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("test");
        list.add("张三");
        list.add("李四");
        list.add("test");
        list.add("test");



        for (int i = 0; i < list.size(); i++) { //注意，删除后，索引会发生变化。
            if ("test".equals(list.get(i))) {
                //list.remove("test");
                list.remove(i);
                i--;
            }
            //ArrayIndexOutOfBoundsException
            //System.out.println(list.get(i));

        }
        System.out.println(list);
    }
}

