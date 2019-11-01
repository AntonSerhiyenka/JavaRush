package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int value1 = Integer.parseInt(reader.readLine());
        int value2 = Integer.parseInt(reader.readLine());
        int value3 = Integer.parseInt(reader.readLine());
        int value4 = Integer.parseInt(reader.readLine());
        int a = Math.max(value1,value2);
        int b = Math.max(value3,value4);
        int c = Math.max(a,b);
        if(value1==value2 && value2==value3 && value3==value4){
            System.out.println(value1);
        }
        else {
            System.out.println(c);
        }
    }
}
