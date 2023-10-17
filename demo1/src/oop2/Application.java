package oop2;

public class Application {

    // 静态的方法和非静态的方法区别很大！
        // 静态方法：方法的调用之和左边，定义的数据类型有关
    // 非静态：重写

    public static void main(String[] args) {
        A a = new A();
        a.test();

        // 父类的引用指向子类
        B b = new A();//子类重写了父类的方法
        b.test();
    }
}
