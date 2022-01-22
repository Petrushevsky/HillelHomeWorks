package com.hillel.homework.Lesson4.Lesson13;

public class Animal {
    public static String DEFAULT_COLOR = "White";
    protected String color;

    public Animal(){}
    public Animal(String color){
        this.color = color;
    }
    public void speak(){
        System.out.println("Animal speaks");
    }
}
