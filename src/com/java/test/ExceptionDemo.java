package com.java.test;

class MyException extends Exception {
    private int detail;

    public MyException(int detail) {
        this.detail = detail;
    }

    @java.lang.Override
    public String toString() {
        return "MyException[" +
                "detail=" + detail +
                ']';
    }
}

public class ExceptionDemo {

    static void compute(int a) throws MyException {
        System.out.println("Called compute(" + a + ")");
        if (a > 10)
            throw new MyException(a);
        System.out.println("Normal exit");
    }

    public static void main(String[] args) {
        try {
            compute(1);
            compute(20);
        } catch (MyException e) {
            System.out.println("Caugh " + e);
        }
    }

}
