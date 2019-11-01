package com.javarush.task.task06.task0611;

/* 
Класс StringHelper
*/

public class StringHelper {
    public static String multiply(String s) {
        String result = "";
        int a;
        for (a = 0; a < 5; a++){
            result = result + s;
        }
        return result;
    }

    public static String multiply(String s, int count) {
        String result = "";
        int i;
        for(i = 0; i < count; i++){
            result = result + s;
        }
        return result;
    }

    public static void main(String[] args) {

    }
}
