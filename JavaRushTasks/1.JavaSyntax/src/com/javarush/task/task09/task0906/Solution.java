package com.javarush.task.task09.task0906;

/* 
Логирование стек-трейса
*/

public class Solution {
    public static void main(String[] args) {
        log("In main method");
    }

    public static void log(String s) {
        System.out.print(Thread.currentThread().getStackTrace()[2].getClassName() + ": ");
        System.out.print(Thread.currentThread().getStackTrace()[2].getMethodName() + ": ");
        System.out.print(s);
    }
}
