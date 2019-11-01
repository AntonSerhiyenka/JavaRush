package com.javarush.task.task13.task1319;

import java.io.*;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String text = reader.readLine();
        BufferedWriter writer = new BufferedWriter(new FileWriter(text));
        String str;
        do {
            str = reader.readLine();
            writer.write(str + "\r\n");
        } while (!str.equals("exit"));
        writer.close();
    }
}

