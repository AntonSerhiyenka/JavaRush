package com.javarush.task.task13.task1318;

import java.io.*;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filePath = reader.readLine();
        reader.close();
        InputStream inputStream = new FileInputStream(filePath);
        while (inputStream.available() > 0) {
            int data = inputStream.read();
            char ch = (char) data;
            System.out.print(ch);
        }
        inputStream.close();
    }
}