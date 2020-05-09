package com.java.test;

class DynStack implements IntStack{
    private int stck[];
    private int tos;

    public DynStack(int size) {
        stck=new int[size];
        tos=-1;
    }

    @java.lang.Override
    public void push(int item) {
        if(tos==stck.length-1){
            int temp[] =new int[stck.length*2];
            for(int i=0;i<stck.length;i++) temp[i]=stck[i];
            stck=temp;
            stck[++tos]=item;
        }else
            stck[++tos]=item;
    }

    @java.lang.Override
    public int pop() {
        if(tos<0){
            System.out.println("Stack underflow");
            return 0;
        }
        else{
            return stck[tos--];
        }
    }
}

public class IFTest2 {
    public static void main(String[] args) {
        DynStack myStack1=new DynStack(5);
        DynStack myStack2=new DynStack(8);

        for(int i=0;i<5;i++) myStack1.push(i);
        for(int i=0;i<8;i++) myStack2.push(i);

        System.out.println("Stack in mystack1:");
        for(int i=0;i<12;i++)
            System.out.println(myStack1.pop());
        System.out.println("Stack i mystack2:");
        for(int i=0;i<20;i++)
            System.out.println(myStack2.pop());
    }
}
