package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double value = Double.parseDouble(reader.readLine());
        double x = value%5;
        if (x>=0.0 && x<3.0)
        {
            System.out.println("зелёный");
        }
        else if ((x>=3.0)&&(x<4.0)){
            System.out.println("жёлтый");
        }
        else if ((x>=4.0)&&(x<5.0)){
            System.out.println("красный");
        }
        }
    }