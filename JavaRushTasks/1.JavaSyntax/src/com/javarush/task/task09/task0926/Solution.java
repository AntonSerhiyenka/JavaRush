package com.javarush.task.task09.task0926;

import java.util.ArrayList;

/* 
Список из массивов чисел
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        ArrayList<int[]> list = new ArrayList<>();
        int[] first = {1,2,3,4,5};
        int[] second = {1,2};
        int[] third = {1,2,3,4};
        int[] fourth = {1,2,3,4,5,6,7};
        int[] fift = new int[0];
        list.add(first);
        list.add(second);
        list.add(third);
        list.add(fourth);
        list.add(fift);
        return list;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
