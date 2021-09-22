package com.lesson11.tms.task3;

public class Produce implements Runnable{

    private threadTask3 number;

    public Produce(threadTask3 number){
        this.number=number;
    }

    @Override
    public void run() {
        for (int i = 1; i < 5; i++) {
            number.produce();
        }
    }
}
