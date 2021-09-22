package com.lesson11.tms.task0;

import java.util.Arrays;

public class ThreadTask0 extends Thread{

    public ThreadTask0(String name) {
        super(name);
    }

    @Override
    public void run() {

        int[] array=new int[10];

        for (int i=0; i< array.length; i++){
            array[i]= (int)(Math.round( Math.random()*100));
        }

        System.out.println(getName()+" "+Arrays.toString(array));
        System.out.println(getName()+" "+ Arrays.stream(array).max());
    }
}
