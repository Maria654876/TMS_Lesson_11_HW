package com.lesson11.tms.task4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Thread.sleep;

public class Task4 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Введите кол-во секунд");
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            int a = 0;
            try {
                a = Integer.parseInt(buff.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (a != -1) {
                ThreadTask4 thread=new ThreadTask4("A");
                thread.sleep(a*1000);
                System.out.println("Я спал "+a);
            }
            else {
                System.out.println("Exit");
                break;
            }
        }
    }
}
