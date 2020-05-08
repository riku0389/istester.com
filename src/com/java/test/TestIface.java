package com.java.test;

class Client implements Callback {
    @java.lang.Override
    public void callBack(int param) {
        System.out.println("callback called with " + param);
    }

    void nonIfaceWmth() {
        System.out.println("Classes that implement interfaces " + "may also define other members, too.");
    }
}

public class TestIface {
    public static void main(String[] args) {
        Callback c=new Client();
        c.callBack(42);

    }
}
