package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 3; i++){
            arrayList.add(Integer.parseInt(reader.readLine()));
        }
        Collections.sort(arrayList);
        for (int i = 2; i >= 0; i--){
            System.out.println(arrayList.get(i));
        }
        }
}
