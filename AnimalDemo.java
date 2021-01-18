package day11_20.day11.demo03;
/*
    向上转型
        从子到父
        父类引用指向子类对象

     向下转型
        从父到子
        父类引用转为子类对象
 */
public class AnimalDemo {
    public static void main(String[] args) {
        //多态
        Animal a = new Cat();//向上转型
        a.eat();


//        A.playGame();
       // ((Cat) A).playGame();   ???
/*
        Cat c = new Cat();
        c.playGame();
        c.eat();
*/
        //Cat c = (Cat) A;c.playGame();  等价于((Cat) A).playGame();
        //向下转型
        Cat c = (Cat) a;
        c.playGame();    //Cat c = (Cat) A;c.playGame();  等价于
        c.eat();

        a =new Dog();

//        Cat cc = ((Cat) A);   //ClassCastException类型转换异常
//        cc.eat();
//        cc.playGame();
    }

}
