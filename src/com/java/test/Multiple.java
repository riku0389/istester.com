package com.java.test;

public class Multiple {
    public static void main(String[] args) {
        try {
//            int a = args.length;
            int a = 2;
            System.out.println("a= " + a);
            int b = 42 / a;
            int c[] = {1};
            c[42] = 99;
        } catch (ArithmeticException e) {
            System.out.println("Division by 0: " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index oob: " + e);
        }
        System.out.println("After try/catch blocks.");
    }
}
