package com.java.test;

class NewThreads extends Thread {

    public NewThreads() {
        super("Demo Thread");
        System.out.println("Child thread: " + this);
        start();
    }

    @java.lang.Override
    public void run(){
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Child Thread: " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Child Interrupted.");
        }
        System.out.println("Exitting child thread");
    }
}

public class ExtndThread {
    public static void main(String[] args) {
        new NewThreads();

        try{
            for(int i=5;i>0;i--){
                System.out.println("Main thread: "+i);
                Thread.sleep(1000);
            }
        }catch(InterruptedException e){
            System.out.println("Main thread interrupted");
        }
        System.out.println("Main thread exiting.");

        }
}
