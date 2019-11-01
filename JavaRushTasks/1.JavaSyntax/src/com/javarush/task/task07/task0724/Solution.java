package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        Human Kate = new Human("Kate",false,88);
        Human Leo = new Human("Leo",true,92);
        Human Ann = new Human("Ann",false,77);
        Human Karl = new Human("Karl",true,81);
        Human Serg = new Human("Serg",true,33, Leo,Kate);
        Human Hanna = new Human("Hanna",false,30, Ann,Karl);
        Human Max = new Human("Max",true,1, Serg,Hanna);
        Human Mikky = new Human("Mikky",true,2, Serg,Hanna);
        Human Karina = new Human("Karina",true,3, Serg,Hanna);
        System.out.println(Kate);
        System.out.println(Leo.toString());
        System.out.println(Ann.toString());
        System.out.println(Karl.toString());
        System.out.println(Serg.toString());
        System.out.println(Hanna.toString());
        System.out.println(Max.toString());
        System.out.println(Mikky.toString());
        System.out.println(Karina.toString());

    }

    public static class Human {
        public String name;
        public boolean sex;
        public int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age;
        }
        public Human(String name, boolean sex, int age, Human father, Human mother){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }


        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }
    }
}