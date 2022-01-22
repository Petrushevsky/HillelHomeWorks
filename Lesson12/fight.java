package com.hillel.homework.Lesson4.Lesson12;

public class fight {
    public static void main(String[] args) {
        RoboChicken fighter1 = new RoboChicken("Rambo",3,3,100);
        RoboChicken fighter2 = new RoboChicken("Micke Tyson", 4,100, 101);
        fighter2.fight(fighter1);
    }
}
