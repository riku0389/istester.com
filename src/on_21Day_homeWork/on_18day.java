package on_21Day_homeWork;

/**
 * 1、什么是继承
 * 2、创建一个Person类，赋予name、age、sex属性，并创建一个有参数的方法赋值
 * 3、创建一个work方法，print打印出结果：name是一个测试工程师
 * 4、创建一个Engineer，继承Person类，调用Person方法
 * 5、在main方法里，new engineer类，对name进行赋值，并调用work方法，查看打印结果
 */
public class on_18day {
    public static void main(String[] args) {
        /***1、继承是java面向对象编程技术的一块基石，因为它允许创建分等级层次的类。
         继承就是子类继承父类的特征和行为，使得子类对象（实例）具有父类的实例域和方法，
         或子类从父类继承方法，使得子类具有父类相同的行为。
         */

        Engineer engineer = new Engineer("张三", 20, "F");
        engineer.work();


    }
}

class Person {
    String name;
    int age;
    String sex;

    public Person(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public void work() {
        System.out.println(name + "是测试工程师");
    }
}

class Engineer extends Person {

    public Engineer(String name, int age, String sex) {
        super(name, age, sex);
    }
}
