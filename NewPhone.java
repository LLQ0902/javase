package day01_10.day10.demo03;
//新手机类
public class NewPhone extends Phone{

    @Override
    public void call(String name){
        System.out.println("开启视频功能");
//        System.out.println("给"+name+"打电话");
        super.call(name);
    }

}