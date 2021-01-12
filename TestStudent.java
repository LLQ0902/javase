package day01_10.day09;
//学生管理系统

import java.util.ArrayList;
import java.util.Scanner;

public class TestStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //创建集合容器对象
        ArrayList<Student> list = new ArrayList<>();

        lo:
        while (true) {

            System.out.println("--------欢迎来到学生管理系统--------");
            System.out.println("1 添加学生");
            System.out.println("2 删除学生");
            System.out.println("3 修改学生");
            System.out.println("4 查看所有学生信息");
            System.out.println("5 退出");
            System.out.println("请输入您的选择");

            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("添加学生信息");
                    addStudent1(list);    //list.add(addStudent(list));
                    break;
                case 2:
                    System.out.println("删除学生信息");
                    deleteStudent1(list);
                    break;
                case 3:
                    System.out.println("修改学生信息");
                    setStudent(list);
                    break;
                case 4:
                    System.out.println("查看所有学生信息");
                    queryStudent(list);

                    break;
                case 5:
                    System.out.println("已退出系统，欢迎下次使用");
                    break lo;
                default:
                    System.out.println("您的输入有误，请重新输入。");
                    break;
            }
        }
    }

    //添加学生  (返回学生对象，此方法没解决学生学号重复的问题)
    public static Student addStudent(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);

        Student s = new Student();

        System.out.println("请输入学生学号：");
        s.setSid(sc.next());//对象名.(成员方法)方法名(键盘录入数据)； 调用学生类set方法赋值；

        System.out.println("请输入学生姓名：");
        s.setName(sc.next());

        System.out.println("请输入学生年龄：");
        s.setAge(sc.nextInt());

        System.out.println("请输入学生生日：");
        s.setBirthday(sc.next());


        System.out.println("添加成功");
        return s;//学生类
    }

    //添加学生  （无返回值，解决了学生学号重复的问题）
    public static void addStudent1(ArrayList<Student> list){
        Scanner sc = new Scanner(System.in);
        String sid;

        while(true){
            System.out.println("请输入学生学号：");
            sid = sc.next();

            int index = getIndex(list,sid);
            if(index == -1){
                break;
            }else{
                System.out.println("学号信息已经存在，请重新输入");
            }
        }

        System.out.println("请输入学生姓名：");
        String name = sc.next();
        System.out.println("请输入学生年龄：");
        int age = sc.nextInt();
        System.out.println("请输入学生生日：");
        String birthday = sc.next();

        Student stu = new Student(sid,name,age,birthday);
        System.out.println("添加成功");

        list.add(stu);

    }

/*
    getIndex:接收一个集合对象，接收一个学生学号

    查找这个学号，在集合中出现的索引位置
 */
    public static int getIndex(ArrayList<Student> list, String sid) {
        //假设传入学号不存在
        int index = -1;
        //遍历集合，获取每一个学生对象，准备进行查找
        for (int i = 0; i < list.size(); i++) {
            //获取每个学生对象的学号
            String id = list.get(i).getSid();//list.get(i).getSid() ==学生对象对象名.getSid()

            //比对遍历获取的学生学号和传入学号
            if (id.equals(sid)) {
                //学号存在
                index = i;
            }
        }
        return index;
    }


    //删除学生信息  (不调用getIndex方法)
    public static void deleteStudent(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要删除的学生的学号：");

        ll:
        for (int i = 0; i < list.size(); i++) {             //list.get(i)  对象名.方法名（）；遍历list容器中元素
            // 这里元素是Student对象，再调用getSid()方法取出sid（学号）
            if (sc.nextLine().equals(list.get(i).getSid())) { //输入的学号与遍历的学号作比较
                list.remove(list.get(i));
                System.out.println("删除成功");
                break ll;
            } else if (i == list.size() - 1) {
                System.out.println("您要删除的学生信息不存在");
            }

        }
    }


    //删除学生信息  (调用getIndex方法)
    public static void deleteStudent1(ArrayList<Student> list){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要删除的学生的学号：");
        String  sid = sc.nextLine();
        int i = getIndex(list, sid);
        if(i == -1){
            System.out.println("您要删除的学生信息不存在，请重新输入");
        }else{
            list.remove(i);
            System.out.println("删除成功");
        }

    }


    //修改学生  (不调用getIndex方法)
    public static void setStudent(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要修改的学生的学号：");
        Student stu = new Student();
        wo:
        for (int i = 0; i < list.size(); i++) {             //list.get(i)  对象名.方法名（）；遍历list容器中元素
            // 这里元素是Student对象，再调用getSid()方法取出sid（学号）
            if (sc.nextLine().equals(list.get(i).getSid())) { //输入的学号与遍历的学号作比较
                System.out.println("请输入学生新的学号：");
                stu.setSid(sc.next());
                System.out.println("请输入学生新的姓名：");
                stu.setName(sc.next());
                System.out.println("请输入学生新的年龄：");
                stu.setAge(sc.nextInt());
                System.out.println("请输入学生新的生日：");
                stu.setBirthday(sc.next());

                list.set(i, stu);
                System.out.println("修改成功");
                break wo;
            } else if (i == list.size() - 1) {
                System.out.println("您要修改的学生信息不存在");
            }

        }
    }


    //修改学生  (调用getIndex方法)
    public static void setStudent1(ArrayList<Student> list){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要修改的学生的学号：");
        String  s = sc.nextLine();
        int i = getIndex(list, s);
        if(i == -1){
            System.out.println("您要修改的学生信息不存在，请重新输入");
        }else{
            System.out.println("请输入学生新的学号：");
            String sid = sc.next();
            System.out.println("请输入学生新的姓名：");
            String name = sc.next();
            System.out.println("请输入学生新的年龄：");
            int age = sc.nextInt();
            System.out.println("请输入学生新的生日：");
            String birthday = sc.next();

            Student stu = new Student(sid,name,age,birthday);
            list.set(i, stu);

            System.out.println("修改成功");
        }
    }


    //查询学生信息
    public static void queryStudent(ArrayList<Student> list) {

        if (list.size() == 0) {
            System.out.println("无信息，请添加信息后查询");
        }

        for (int i = 0; i < list.size(); i++) {

            System.out.println("学号\t姓名\t年龄\t生日");
            System.out.println(list.get(i).getSid() + "\t" + list.get(i).getName() + "\t" + list.get(i).getAge() + "岁" + "\t" + list.get(i).getBirthday());
        }
    }

}
