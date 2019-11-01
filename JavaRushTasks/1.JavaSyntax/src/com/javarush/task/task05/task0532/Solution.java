package com.javarush.task.task05.task0532;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(reader.readLine());
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < x; i++){
            arrayList.add(Integer.parseInt(reader.readLine()));
        }
        Collections.sort(arrayList);

        System.out.println(arrayList.get(x-1));
    }
}
