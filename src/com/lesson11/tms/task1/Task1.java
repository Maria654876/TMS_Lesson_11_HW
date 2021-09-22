package com.lesson11.tms.task1;

public class Task1 {
    public static void main(String[] args) {
        ThreadTask1 A=new ThreadTask1();
        ThreadTask1 B=new ThreadTask1();
        ThreadTask1 C=new ThreadTask1();
        ThreadTask1 D=new ThreadTask1();
        ThreadTask1 E=new ThreadTask1();

        A.run();
        B.run();
        C.run();
        D.run();
        E.run();
    }
}
