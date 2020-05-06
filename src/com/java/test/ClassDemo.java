package com.java.test;

class Person{
    String name;
    int age;
    int sex;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    void result(){
        System.out.println("name :"+name+" "+"age: "+age+" "+"sex: "+" "+sex);
    }
}

public class ClassDemo {
    public static void main(String[] args) {
        Person p1=new Person();
        p1.name="zhangsan";
        p1.setAge(26);
        p1.setSex(1);
        p1.result();
    }
}
