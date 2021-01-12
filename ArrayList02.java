package day01_10.day08;
/*
 *       集合常用成员方法：
 *           添加：
 *               boolean add(E e)将指定的元素添加到此列表的尾部。
 *               void add(int index,E element)将指定的元素插入此列表中的指定位置。
 *
 *            删除：
 *               public boolean remove(Object o)删除指定的元素，返回删除是否成功
 *               public E remove (int index)删除指定索引处的元素，返回被删除的元素
 *
 *            修改：
 *               public E set (int index,E element)修改指定索引处的元素，返回被修改的元素
 *
 *             查询;
 *               public E get(int index)返回指定索引处的元素
 *               public int size()返回集合的元素的个数
 *
 * */

import java.util.ArrayList;

public class ArrayList02 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("asd");
        list.add("111");
        list.add("222");
        list.add("333");
        list.add("444");
        list.add("555");
        String s = list.get(2);//public E get(int index)返回指定索引处的元素
        int z = list.size();//public int size()返回集合的元素的个数
        System.out.println(s);
        System.out.println(list);
        System.out.println(z);

       testSet();


    }

    private static void testSet() {
        ArrayList<String> list = new ArrayList<>();
        list.add("asd");
        list.add("111");
        list.add("222");
        list.add("333");
        list.add("444");
        list.add("555");
        System.out.println(list);
//public E set (int index,E element)修改指定索引处的元素，返回被修改的元素
        String s = list.set(2, "888");
        System.out.println(list);
        System.out.println(s);//返回被修改的元素
    }

    private static void testRemove() {
        ArrayList<String> list = new ArrayList<>();
        list.add("asd");
        list.add("111");
        list.add("222");
        list.add("333");
        list.add("444");
        list.add("555");
        System.out.println(list);
// public E remove (int index)删除指定索引处的元素，返回被删除的元素
        String s = list.remove(1);
        System.out.println(s);//返回被删除的元素
        System.out.println(list);

//  public boolean remove(Object o)删除指定的元素，返回删除是否成功
        boolean b = list.remove("222");
        boolean b1 = list.remove("zzz");

        System.out.println(b);//返回删除是否成功
        System.out.println(b1);//返回删除是否成功

        System.out.println(list);
    }
}
