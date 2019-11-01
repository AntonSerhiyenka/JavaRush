package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        Map<String, Integer> map = new HashMap<>();
        map.put("Ivan", 500);
        map.put("Dasha", 1500);
        map.put("Karl", 2500);
        map.put("Moriz", 200);
        map.put("Mark", 100);
        map.put("David", 50);
        map.put("Sergey", 40);
        map.put("Kostya", 5400);
        map.put("Yasha", 5100);
        map.put("Tanya", 8500);

        return (HashMap<String, Integer>) map;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        for(Iterator<Map.Entry<String, Integer>> it = map.entrySet().iterator(); it.hasNext(); ) {
            Map.Entry<String, Integer> entry = it.next();
            if(entry.getValue() < 500) {
                it.remove();
            }
        }
    }

    public static void main(String[] args) {

    }
}