package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        Map<String, String> map = new HashMap<>();
        map.put("Ivan", "Marchik");
        map.put("Ilan", "Marchik");
        map.put("Graf", "Marchik");
        map.put("Brad", "Markov");
        map.put("Ivan", "Markov");
        map.put("van", "Mark");
        map.put("Graf", "Mark");
        map.put("Brad", "Mishin");
        map.put("Ilan", "Mishin");
        map.put("Ilan", "Mishin");


        return map;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
