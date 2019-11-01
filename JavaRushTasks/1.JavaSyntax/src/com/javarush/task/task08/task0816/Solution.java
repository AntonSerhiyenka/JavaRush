package com.javarush.task.task08.task0816;



import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static HashMap<String, Date> createMap() throws ParseException {
        DateFormat df = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", df.parse("JUNE 1 1980"));
        map.put("Vandam", df.parse("JULY 1 1980"));
        map.put("Haik", df.parse("MARCH 1 1980"));
        map.put("Smith", df.parse("FEBRUARY 1 1980"));
        map.put("Mark", df.parse("JUNE 1 1980"));
        map.put("Spenser", df.parse("AUGUST 1 1980"));
        map.put("Jack", df.parse("SEPTEMBER 1 1980"));
        map.put("David", df.parse("NOVEMBER 1 1980"));
        map.put("Russel", df.parse("OCTOBER 1 1980"));
        map.put("Marks", df.parse("JULY 1 1980"));

        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map){
//        Iterator it = map.entrySet().iterator();
//        while (it.hasNext()) {
//            Map.Entry<String, Date> pair = (Map.Entry)it.next();
//            if(pair.getValue().getMonth() > 4 && pair.getValue().getMonth() < 8)
//            map.remove(pair.getKey());
//        }
        map.entrySet().removeIf(e-> (e.getValue()).getMonth()>=5 && (e.getValue()).getMonth()<=7);
    }

    public static void main(String[] args) {

    }
}
