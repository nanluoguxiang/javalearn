# super注意点：
* super调用父类的构造方法，必须在构造方法的第一个
* super必须只能出现在子类的方法或者构造方法中！
* super和this不能同时调用构造方法

# vs this
* 代表的对象不同：
  * this：本身调用者这个对象
  * super：代表父类对象的应用
* 前提：一shi
  * this：没有集成也可以使用
  * super：只能在继承条件才可以使用
* 构造方法
  * this()：本类的构造
  * super()：父类的构造


# 重写：需要有继承关系，子类重写父类的方法！
* 方法名必须相同
* 参数列表必须相同
* 修饰符：范围可以扩大但不能缩小：public > protected > default > private
* 抛出的异常：范围可以被缩小，但不能扩大：ClassNotFoundException --> Exception(大)

**重写，子类的方法和父类必须一致，方法体不同**

* 为什么需要重写：
  * 父类的功能，子类不一定需要，或者不一定满足！
  * Alt + Insert    override

# 多态注意事项
* 多态是方法的多态，属性没有多态
* 父类和子类，有联系 类型转换异常! ClasssCastException!
* 存在条件：继承关系，方法需要重写，父类的引用指向子类对象！ Father f1 = new Son();


**static 方法，属于类，它不属于实例**

**final 常量**

**private 方法**

```agsl
package oop.demo06;

public class Student extends Person{

    @Override
    public void run() {
        System.out.println("son");
    }

    public void eat(){
        System.out.println("ear");
    }
}
```

```agsl
package oop.demo06;

public class Person {

    public void run(){

    }
}

```

```package oop.demo06;

public class Application {
    public static void main(String[] args) {
        //一个对象的实际类型是确定的
        //new Student();
        //new Person();

        //可以指向的引用类型就不确定了：父类的引用指向子类

        //Student 能调用的方法都是自己的或者集成父类的！
        Student s1 = new Student();
        Person s2 = new Student();
        Object s3 = new Student();

        // 对象能执行哪些方法，主要看对象左边的类型，和右边关系不大！
        s2.run();   //子类重写了父类的方法，执行子类的方法
        ((Student) s2 ).eat();
        s1.eat();

    }
}
```


System.out.println(X instanceof Y);  能不能编译通过

取决于x和y之间是否有父子关系

* 父类引用指向子类的对象
* 把子类转换为父类，向上转型；
* 把父类转换为子类，向下转型；强制转换
* 方便方法的调用，减少重复的代码！简洁


# 接口的作用
* 约束
* 定义一些方法，让不同的人实现
* public abstract
* public static final
* 接口不能被实例化，接口中没有构造方法
* implements可以实现多个接口
* 必须要重写接口中的方法·