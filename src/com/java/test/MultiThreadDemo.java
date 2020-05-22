package com.java.test;

class NewThreadd implements Runnable {
    String name;
    Thread t;

    public NewThreadd(String name) {
        this.name = name;
        t = new Thread(this, name);
        System.out.println("New thread: " + t);
        t.start();
    }

    @java.lang.Override
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(name + ": " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(name + "Interrupted");
        }
        System.out.println(name + " exiting.");
    }
}

public class MultiThreadDemo {
    public static void main(String[] args) {
        new NewThreadd("one");
        new NewThreadd("two");
        new NewThreadd("three");

        try {
            Thread.sleep(10000);

        } catch (InterruptedException e) {
            System.out.println("Main thread Interrupted");
        }
        System.out.println("Main thread exiting.");
    }
}
