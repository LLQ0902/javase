package day01_10.day04;

/**
 * JRE（Java Runtime Environment），Java运行环境，包含了JVM和Java的核心类库（Java API）
 * JDK（Java Development Kit）称为Java开发工具，包含了JRE和开发工具
 * JVM（Java Virtual Machine），Java虚拟机
 *
 *  关键字是指被java语言赋予了特殊含义的单词。
 *
 *  关键字的特点：
 *  关键字的字母全部小写。
 *  常用的代码编辑器对关键字都有高亮显示，比如现在我们能看到的public、class、static等。
 *
 *  标识符是用户编程时使用的名字，用于给类、方法、变量、常量等命名。
 *
 * Java中标识符的组成规则：
 * 由字母、数字、下划线“_”、美元符号“$”组成，第一个字符不能是数字。
 * 不能使用java中的关键字作为标识符。
 * 标识符对大小写敏感（区分大小写）。
 *
 * Java中标识符的命名约定：
 *
 * 小驼峰式命名：变量名、方法名
 * 首字母小写，从第二个单词开始每个单词的首字母大写。
 *
 * 大驼峰式命名：类名
 * 每个单词的首字母都大写。
 * 另外，标识符的命名最好可以做到见名知意
 * 例如：username、studentNumber等。
 */


public class HelloWorld {
    public static void main(String[] args) {
        //单行注释

        /*
        多行注释
         */

        /**
         * 文档注释
         */
        System.out.println("HelloWorld");

        System.out.println("谁不曾一意孤行，怒发冲冠过怕只怕少了那份执着");
        System.out.println("世界上那些最容易的事情中，拖延时间最不费力");
        System.out.println("你若不想做，会找一个或无数个借口；你若想做，会想一个或无数个办法");
    }
}
