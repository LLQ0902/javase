package day01_10.day04;

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        String username = "123456";//用户名
        String password = "a123456";//密码
        Scanner sc = new Scanner(System.in);


        for (int i = 0; i <3; i++) {
            System.out.println("请输入账号：");
            String u1 = sc.nextLine();
            System.out.println("请输入密码：");
            String p1 = sc.nextLine();

            if(username.equals(u1) && password.equals(p1)){
                System.out.println("登录成功");
                break;
            }else {
                if(i<2){
                    System.out.println("账号或密码错误，您还剩"+(2-i)+"次机会，请重新输入");
                }else{
                    System.out.println("今日账号密码输入错误已经达到三次，请明天再来。");
                }
            }
        }

    }
}
