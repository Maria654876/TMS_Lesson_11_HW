package com.lesson11.tms.task3;

public class Task3 {

    public static void main(String[] args) {
        threadTask3 thread =new threadTask3();

        Consume consume=new Consume(thread);
        Produce produce=new Produce(thread);

        new Thread(consume).start();
        new Thread(produce).start();
    }

}
