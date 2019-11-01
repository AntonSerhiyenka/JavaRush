package com.javarush.task.task04.task0441;


/* 
Как-то средненько
*/
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            arrayList.add(Integer.parseInt(reader.readLine()));
        }
        Collections.sort(arrayList);
        System.out.println(arrayList.get(1));
    }
}
