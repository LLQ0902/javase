package day01_10.day07;

public class StringBuilder03 {
    /*
    成员方法：
            public StringBuilder append(任意类型)：添加数据，并返回对象本身
            public StringBuilder reverse():返回相反的字符序列
            public int length() :返回长度（字符串出现的个数）
            public String toString():通过toString()就可以实现把StringBuilder转换为String


     */
    public static void main(String[] args) {


//        sb.append("红色");
//        System.out.println(sb);
//        sb.append("蓝色");
//        System.out.println(sb);
//        sb.append("绿色");
//        System.out.println(sb);

//        StringBuilder sb2 = sb.append("红色");
//        StringBuilder sb3 = sb.append("蓝色");//StringBuilder sb3 = sb2.append("蓝色");
//
//        System.out.println(sb == sb2);
//        System.out.println(sb2 == sb3);

        StringBuilder sb = new StringBuilder ();
        //链式编程：如果一个方法返回的是对象类型，对象就可以继续向下调用方法
        sb.append("红色").append("蓝色").append("绿色");
                                                              // 运行结果
        System.out.println("反转前："+ sb);                  //反转前：红色蓝色绿色
                                                              //反转后：色绿色蓝色红
        sb.reverse();                                         //sb中字符的个数：6
        System.out.println("反转后："+ sb);                  //色绿色蓝色红

        sb.length();

        System.out.println("sb中字符的个数："+  sb.length());

        String s = sb.toString();
        System.out.println(s);
    }
}
