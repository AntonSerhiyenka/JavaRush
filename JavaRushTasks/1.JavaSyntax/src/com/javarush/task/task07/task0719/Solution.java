package com.javarush.task.task07.task0719;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


/* 
Вывести числа в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> list = new ArrayList<>();

        for (int a=0; a<10; a++) {
            int b = Integer.parseInt(reader.readLine());
            list.add(b);
        }
        for (int d=9; d>=0; d--) {
            System.out.println(list.get(d));
        }//напишите тут ваш код
    }
}
