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