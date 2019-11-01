package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader((new InputStreamReader(System.in)));
        int value = Integer.parseInt(reader.readLine());
        if(value>0){
            System.out.println(value*2);
        }
        else if(value==0){
            System.out.println(0);
        }
        else {
            System.out.println(value + 1);
        }
    }
}