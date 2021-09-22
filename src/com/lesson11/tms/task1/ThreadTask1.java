package com.lesson11.tms.task1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class ThreadTask1 implements Runnable {

    Thread thread;

    ThreadTask1(){
        thread=new Thread(this);
    }

    @Override
    public void run() {
       MyArray();
    }

    private void MyArray(){
        try {
            FileWriter array = new FileWriter("array.txt");
            BufferedWriter arrayRandom = new BufferedWriter(array);

            int[] MyArray=new int[10];

            for (int i=0; i<MyArray.length; i++){
                MyArray[i]= (int)Math.round( Math.random()*100);
            }
            System.out.println(Arrays.toString(MyArray));
            arrayRandom.write(Arrays.toString((MyArray)));
            arrayRandom.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
