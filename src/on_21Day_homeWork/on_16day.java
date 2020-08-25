package on_21Day_homeWork;

/**
 * 类和对象
 * 1、创建一个类，名字为person，赋予属性name、age、sex
 * 2、在main方法里new person对象，用set方法对person赋值
 * 3、print语句打印出person方法的属性
 */
public class on_16day {
    public static void main(String[] args) {
        Person_16 persaon = new Person_16();
        persaon.setName("zhangsan");
        persaon.setAge(22);
        persaon.setSex("male");
        System.out.println(persaon.getName() + "," + persaon.getAge() + "," + persaon.getSex());

    }
}

class Person_16 {
    String name;
    int age;
    String sex;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }
}
