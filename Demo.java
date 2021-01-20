package day11_20.day13.demo03;

/**
 * @author 小小刘
 * @date 2020/12/5 21:09
 */
public class Demo {
    public static void main(String[] args) {
        BasketballAthlete b = new BasketballAthlete();
        b.setName("詹姆斯");
        b.setAge(23);
        b.eat();
        b.study();
        System.out.println(b.getName()+","+b.getAge());
        System.out.println("--------------------");

        PingPongAthlete p = new PingPongAthlete();
        p.setName("邓亚萍");
        p.setAge(34);
        p.eat();
        p.study();
        p.studyEnglish();
        System.out.println(p.getName()+","+p.getAge());
        System.out.println("--------------------");

        BasketballCoach c = new BasketballCoach("乔丹",27);
        c.teach();
        c.eat();
        System.out.println(c.getName()+","+c.getAge());

        System.out.println("--------------------");
        PingPongCoach g = new PingPongCoach("刘某某",40);
        g.eat();
        g.teach();
        g.studyEnglish();
        System.out.println(g.getName()+","+g.getAge());
    }

}
