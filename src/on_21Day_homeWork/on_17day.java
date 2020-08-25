package on_21Day_homeWork;

/**
 * 构造方法
 * 1、什么是构造方法，java默认有构造方法么？
 * 2、定义一个无参数的构造方法和有参数的构造方法
 * 定义一个person类，构造一个无参数的构造方法：person(){}，并打印结果：我是一个无参数的构造方法
 * 3、在main方法里new person类，分别构造有参数和无参数的方法，print打印结果
 */
public class on_17day {
    public static void main(String[] args) {
        /**
         * 1、构造方法：构造方法是对象被创建时初始化对象的成员方法，它具有和它所在的类完全一样的名字
         */
        Person_17 person=new Person_17();
        Person_17 person1=new Person_17("りく");
    }
}

class Person_17 {
    Person_17() {
        System.out.println("我是一个无参数的构造方法");
    }

    Person_17(String name) {
        System.out.println("我是一个有参数的构造方法，我的名字是：" + name);
    }
}
