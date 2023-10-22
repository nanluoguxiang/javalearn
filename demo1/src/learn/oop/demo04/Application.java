package learn.oop.demo04;

/*
封装的意义：
    1.提高程序的安全性，保护数据
    2.隐藏代码的实现细节
    3.统一接口
    4.系统可维护性增加了
属性私有：get/set
 */

public class Application {
    public static void main(String[] args) {
        Student s1 = new Student();

        s1.setName("zhj");

        System.out.println(s1.getName());


    }

}




