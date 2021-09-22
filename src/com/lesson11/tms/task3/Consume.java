package com.lesson11.tms.task3;

public class Consume implements Runnable{

    private threadTask3 number;

    public Consume(threadTask3 number){
        this.number=number;
    }

    @Override
    public void run() {
        for (int i = 1; i < 5; i++) {
            try {
                number.consume();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
