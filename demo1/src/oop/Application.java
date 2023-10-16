package oop;

import oop.demo03.Pet;

public class Application {
    public static void main(String[] args) {

        /*
        1.类与对象
        类是一个模板：抽象，对象是一个具体的实例
        2.方法
        定调用

        3.对应的引用
        引用类型：基本类型（8）
        对象是通过引用来操作的：栈---->堆（地址）

        4.属性：字段Field 成员变量
        默认初始化：
            数字：0 0.0
            char: u0000
            boolean: false
            引用： null
        修饰符 属性类型 属性名=属性值！

        5.对象的创建和使用：
            必须使用 new 关键字创造对象，构造器 new Person();Person kuangshen = new Person();
            对象的属性 kuangshen.name
            对象的方法 kuangshen.sleep()

        6.类
            静态的属性 属性
            动态的行为 方法

        封装、集成、多态


         */
//        Pet dog = new Pet();
//        dog.name = "旺财";
//        dog.age = 3;
//        dog.shout();
//
//        System.out.println(dog.name);
//        System.out.println(dog.age);
//
//        Pet cat = new Pet();


    }
}




/*
        // 类：抽象的，实例化
        // 类实例化后会返回一个自己的对象！
        // student对象就是一个Student类的具体实例！

        Student xiaoming = new Student();
        Student xh = new Student();

        xiaoming.name = "小明";
        xiaoming.age = 3;

        System.out.println(xiaoming.name);
        System.out.println(xiaoming.age);

        xh.name = "小红";
        xh.age = 3;

        System.out.println(xh.name);
        System.out.println(xh.age);
 */