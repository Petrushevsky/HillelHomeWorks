package com.hillel.homework.Lesson4.Lesson13;

public class Cat extends Animal {
    String breed;
    public Cat(String color, String breed){
        super(color);
        this.breed = breed;
    }
    @Override
    public void speak(){
        super.speak();
        System.out.println("Meow");
    }
}
