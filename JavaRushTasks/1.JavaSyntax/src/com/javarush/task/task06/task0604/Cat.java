package com.javarush.task.task06.task0604;

/* 
Ставим котов на счётчик
*/

public class Cat {
    public static int catCount = 0;

    public Cat (){
        catCount = catCount +1;
    }

    protected void finalize() throws Throwable {
        catCount = catCount - 1;
    }

    public static void main(String[] args) {

    }
}