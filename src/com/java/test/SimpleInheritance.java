package com.java.test;

class A {
    int i, j;

    void showIj() {
        System.out.println("i and j: " + i + " " + j);
    }
}

class B extends A {
    int k;

    void showK() {
        System.out.println("k: " + k);
    }

    void sum() {
        System.out.println("i+j+k: " + (i + j + k));
    }
}

public class SimpleInheritance {
    public static void main(String[] args) {
        A superOb = new A();
        B subOb = new B();

        superOb.i = 10;
        superOb.j = 20;
        System.out.println("Centents of superOb:");
        superOb.showIj();
        System.out.println();

        subOb.i = 7;
        subOb.j = 8;
        subOb.k = 9;
        System.out.println("Contents of subOb: ");
        subOb.showIj();
        subOb.showK();
        System.out.println();

        System.out.println("Sum of i,j and k in subOb:");
        subOb.sum();
    }
}
