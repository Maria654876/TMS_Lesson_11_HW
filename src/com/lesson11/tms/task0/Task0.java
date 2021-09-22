package com.lesson11.tms.task0;

public class Task0 {
    public static void main(String[] args) {
        ThreadTask0 A=new ThreadTask0("A");
        ThreadTask0 B=new ThreadTask0("B");
        ThreadTask0 C=new ThreadTask0("C");
        ThreadTask0 D=new ThreadTask0("D");
        ThreadTask0 E=new ThreadTask0("E");
        ThreadTask0 F=new ThreadTask0("F");
        ThreadTask0 G=new ThreadTask0("G");
        ThreadTask0 H=new ThreadTask0("H");
        ThreadTask0 I=new ThreadTask0("I");
        ThreadTask0 J=new ThreadTask0("J");

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
    }
}
