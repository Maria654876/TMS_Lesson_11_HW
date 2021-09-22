package com.lesson11.tms.task3;

import java.util.LinkedList;

import static java.lang.Thread.sleep;

public class threadTask3  {

    LinkedList<Integer> list=new LinkedList<>();

    public void produce(){
        while (list.size()>10){
            try {
                wait();
            }
            catch (InterruptedException e) {
            }
        }
        for (int i=0; i<10; i++){
            list.add(i);
        }

        System.out.println(list);

        notify();
    }

    public void consume() throws InterruptedException {
        while (list.size() < 1) {
            try {
                wait();
            }
            catch (InterruptedException e) {
            }
        }
        double t=Math.random()*10;

        sleep((long) t);

        list.removeFirst();

        System.out.println(list);

        notify();
    }
}
