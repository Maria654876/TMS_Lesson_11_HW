package com.lesson11.tms.task2;

import com.lesson11.tms.task0.ThreadTask0;

public class Task2 {
    public static void main(String[] args) throws InterruptedException {
        ThreadTask2 A=new ThreadTask2("A");
        ThreadTask2 B=new ThreadTask2("B");
        ThreadTask2 C=new ThreadTask2("C");
        ThreadTask2 D=new ThreadTask2("D");
        ThreadTask2 E=new ThreadTask2("E");
        ThreadTask2 F=new ThreadTask2("F");
        ThreadTask2 G=new ThreadTask2("G");
        ThreadTask2 H=new ThreadTask2("H");
        ThreadTask2 I=new ThreadTask2("I");
        ThreadTask2 J=new ThreadTask2("J");

        A.start();
        B.start();
        C.start();
        D.start();
        E.start();
        F.start();
        G.start();
        H.start();
        I.start();
        J.start();

        A.thread();
        B.thread();
        C.thread();
        D.thread();
        E.thread();
        F.thread();
        G.thread();
        H.thread();
        I.thread();
        J.thread();
    }
}
