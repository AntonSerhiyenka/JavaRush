package com.javarush.task.task14.task1408;


public class BelarusianHen extends Hen implements Country {
    @Override
    int getCountOfEggsPerMonth() {
        return 100;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " Моя страна - " + BELARUS + ". " + "Я несу " + this.getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
