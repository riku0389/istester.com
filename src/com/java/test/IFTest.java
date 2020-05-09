package com.java.test;

interface IntStack {
    void push(int item);

    int pop();
}

class FixedStack implements IntStack {
    private int sTck[];
    private int tos;

    public FixedStack(int size) {
        sTck = new int[size];
        tos = -1;
    }

    @java.lang.Override
    public void push(int item) {
        if (tos == sTck.length - 1)
            System.out.println("Stack is full");
        else
            sTck[++tos] = item;
    }

    @java.lang.Override
    public int pop() {
        if (tos < 0) {
            System.out.println("Stack underflow");
            return 0;
        } else {
            return sTck[tos--];
        }
    }
}

public class IFTest {
    public static void main(String[] args) {
        FixedStack myStack1 = new FixedStack(5);
        FixedStack myStack2 = new FixedStack(8);

        for (int i = 0; i < 5; i++) myStack1.push(i);
        for (int i = 0; i < 8; i++) myStack2.push(i);

        System.out.println("Stack in mystack1:");
        for (int i = 0; i < 5; i++)
            System.out.println(myStack1.pop());

        System.out.println("Stack in mystack2:");
        for (int i = 0; i < 8; i++)
            System.out.println(myStack2.pop());
    }
}
