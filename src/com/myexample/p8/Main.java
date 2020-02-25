package com.myexample.p8;

public class Main implements Runnable{
    private Thread thread1;
    private Thread thread2;

    public Thread getThread1() {
        return thread1;
    }

    public Thread getThread2() {
        return thread2;
    }

    public void run (Runnable r1, Runnable r2) throws InterruptedException{
        this.thread1 = new Thread(r1, "r1");
        this.thread2 = new Thread(r2, "r2");

        Thread thread = new Thread(this);

        System.out.println("2nd thread starting");
        thread.start();
        thread.join();
        System.out.println("2nd thread stopped");
    }

    @Override
    public void run() {

        thread1.start();

        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        thread2.start();

        try {
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println("main thread starting");
        Runnable r1 = new MyRunnable();
        Runnable r2 = new MyRunnable();
        Main main = new Main();
        main.run(r1, r2);
        System.out.println("main thread stopped");
    }
}

class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " started");
        try {
            Thread.sleep(5000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " stopped");
    }
}
