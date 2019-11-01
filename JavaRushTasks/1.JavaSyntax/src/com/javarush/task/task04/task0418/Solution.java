package com.javarush.task.task04.task0418;

/* 
Минимум двух чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int value1 = Integer.parseInt(reader.readLine());
        int value2 = Integer.parseInt(reader.readLine());
        if(value1>value2){
            System.out.println(value2);
        }
        else if(value2>value1){
            System.out.println(value1);
        }
        else if(value1==value2){
            System.out.println(value1);
        }

    }
}