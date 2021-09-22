package com.lesson11.tms.task2;

import java.util.Date;

public class ThreadTask2 extends Thread{
    public ThreadTask2(String name) {
        super(name);
    }

    @Override
    public void run() {
        super.run();
    }

    Date date=new Date();

    public synchronized void thread() throws InterruptedException {
        System.out.println("Thread name "+getName());
        System.out.println("Running time "+date.toString());
        sleep(5000);
    }

}
