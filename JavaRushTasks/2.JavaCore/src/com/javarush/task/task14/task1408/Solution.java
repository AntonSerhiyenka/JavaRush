package com.javarush.task.task14.task1408;

/* 
Куриная фабрика
*/

import static com.javarush.task.task14.task1408.Country.BELARUS;

public class Solution {
    public static void main(String[] args) {
        Hen hen = HenFactory.getHen(BELARUS);
        hen.getCountOfEggsPerMonth();
    }

    static class HenFactory implements Country {

        static Hen getHen(String country) {
            Hen hen = null;
            if (country.equals(BELARUS)) {
                hen = new BelarusianHen();
            } else if (country.equals(UKRAINE)) {
                hen = new UkrainianHen();
            } else if (country.equals(RUSSIA)) {
                hen = new RussianHen();
            } else if (country.equals(MOLDOVA)) {
                hen = new MoldovanHen();
            }
            return hen;
        }
    }


}
