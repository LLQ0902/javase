package day01_10.day09;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author 小小刘
 * @date 2020/12/9 10:48
 */
public class TestJiShi {
    public static void main(String[] args) {
        //创建集合，存储信息。
        ArrayList<JiShi> list = new ArrayList<>();
        //创建输入
        Scanner sc = new Scanner(System.in);
        System.out.println("-------欢迎进入五楼管理系统-------");
        ol:
        while (true) {
            System.out.println(" 1  添加技师");
            System.out.println(" 2  删除技师");
            System.out.println(" 3  修改技师");
            System.out.println(" 4  查看技师");
            System.out.println(" 5  退出");
            System.out.print("请输入：");
            int number = sc.nextInt();

            switch (number) {
                case 1:
                    System.out.println("添加技师:");
                    addJiShi(list);
                    break;
                case 2:
                    System.out.println("删除技师:");
                    deleteJiShi(list);
                    break;
                case 3:
                    System.out.println("修改技师:");
                    amendJiShi(list);
                    break;
                case 4:
                    System.out.println("查看技师:");
                    printJiShi(list);
                    break;
                case 5:
                    System.out.println("退出系统，欢迎下次光临~");
                    break ol;
                default:
                    System.out.println("输入有误！");
            }
        }
    }


    //添加技师
    public static void addJiShi(ArrayList<JiShi> list) {
        JiShi a = new JiShi();
        Scanner sc = new Scanner(System.in);
        ao:
        while (true) {
            System.out.println("请输入id(输入return返回):");
            String s = sc.next();
            if (s.equals("return")) {
                return;
            }
            boolean b = true;
            a.setSid(s);
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getSid().equals(s)) {
                    System.out.println("工号已经存在，请重新输入");
                    b = false;
                }
            }
            if (b) {
                break ao;
            }
        }
        System.out.println("请输入姓名:");
        a.setName(sc.next());
        System.out.println("请输入年龄:");
        a.setAge(sc.nextInt());
        System.out.println("请输入生日:");
        a.setBirthday(sc.next());

        list.add(a);
    }

    //删除技师
    public static void deleteJiShi(ArrayList<JiShi> list) {
        System.out.println("请输入需要删除技师的id");
        Scanner sc = new Scanner(System.in);
        String id = sc.next();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getSid().equals(id)) {
                System.out.println(list.get(i).getSid() + "" + list.get(i).getName() + "技师,已删除");
                list.remove(i);
                return;
            }
        }
        System.out.println("您要删除的技师信息不存在！");
    }

    //修改技师
    public static void amendJiShi(ArrayList<JiShi> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入技师工号");
        String id = sc.next();
        ak:
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getSid().equals(id)) {
                System.out.println("已找到该工号技师信息，请输入您需要修改的信息：");
                System.out.println("1  工号");
                System.out.println("2  姓名");
                System.out.println("3  年龄");
                System.out.println("4  生日");
                System.out.println("5  重新定义信息");
                System.out.println("6  返回");

                while (true) {
                    int a = sc.nextInt();
                    switch (a) {
                        case 1:
                            System.out.println("请输入技师新的工号:");
                            String s1 = sc.next();
                            list.get(i).setSid(s1);
                            System.out.println("修改完成");
                            return;
                        case 2:
                            System.out.println("请输入技师新的姓名:");
                            String s2 = sc.next();
                            list.get(i).setName(s2);
                            System.out.println("修改完成");
                            return;
                        case 3:
                            System.out.println("请输入技师新的年龄:");
                            int i1 = sc.nextInt();
                            list.get(i).setAge(i1);
                            System.out.println("修改完成");
                            return;
                        case 4:
                            System.out.println("请输入技师新的生日:");
                            String s3 = sc.next();
                            list.get(i).setBirthday(s3);
                            System.out.println("修改完成");
                            return;
                        case 5:
                            System.out.println("请输入技师新的信息:");
                            String s4 = sc.next();
                            String s5 = sc.next();
                            int i2 = sc.nextInt();
                            String s6 = sc.next();
                            list.get(i).setSid(s4);
                            list.get(i).setName(s5);
                            list.get(i).setAge(i2);
                            list.get(i).setBirthday(s6);
                            System.out.println("修改完成");
                            return;
                        case 6:
                            System.out.println("返回成功！");
                            return;
                        default:
                            System.out.println("您的输入有误，请重新输入！");
                    }
                }
            }
        }
        System.out.println("您要修改的技师信息不存在！");

    }


    //查看技师
    public static void printJiShi(ArrayList<JiShi> list) {
        System.out.println("工号\t姓名\t年龄\t生日");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getSid() + "\t\t" + list.get(i).getName() + "  \t" + list.get(i).getAge() + "\t \t" + list.get(i).getBirthday());
        }
    }
}
