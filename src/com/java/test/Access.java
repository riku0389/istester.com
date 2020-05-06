package com.java.test;

class A1 {
    int i;
    private int j;

    void setIj(int x, int y) {
        i = x;
        j = y;
    }
}

class B1 extends A1 {
    int total;

    void sum() {
//        total = i + j;
    }
}

public class Access {
    public static void main(String[] args) {
        B1 subOb = new B1();
        subOb.setIj(10, 12);
        subOb.sum();
        System.out.println("tatal is " + subOb.total);
    }
}
