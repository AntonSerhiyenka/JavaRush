package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        int x = 0;
        String newNumber = String.valueOf(number);
        for (int i = 0; i < newNumber.length(); i++) {
            int j = Character.digit(newNumber.charAt(i), 10);
            x += j;
        }
        return x;
    }
}