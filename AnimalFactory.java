package day11_20.day11.factory;

/**
 * @author 小小刘
 * @date 2020/12/16 16:37
 */
public class AnimalFactory {

    //私有本类的构造方法，其目的是不允许其它类创建该类的对象
    private AnimalFactory(){}

    public static Animal createAnimal(int id){
        if(id == 1){
            return new Dog();
        }else if(id == 2){
            return new Cat();
        }else {
            return new Dog();
        }
    }
}
