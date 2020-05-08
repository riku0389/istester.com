package com.java.test;

import java.lang.reflect.AnnotatedArrayType;

class AnotherClient implements Callback {

    @java.lang.Override
    public void callBack(int param) {
        System.out.println("ANother version of callback");
        System.out.println("p squared id " + (param * param));
    }
}

public class TestIface2 {
    public static void main(String[] args) {
        Callback c = new Client();
        AnotherClient ob = new AnotherClient();

        c.callBack(42);

        c = ob;
        c.callBack(42);
        ob.callBack(5);
    }
}
