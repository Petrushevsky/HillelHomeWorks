package com.hillel.homework.Lesson4.Lesson13;

import java.util.ArrayList;
import java.util.List;

public class Petstore {
    public static void main(String[] args) {
        Animal cat = new Cat();
       // cat.speak();
        Animal dog = new Dog();
        Animal cat2 = new Cat();

        //dog.speak();

        Animal[] animals1 = new Animal[2];
        List<Animal> animals = new ArrayList<>();
        animals.add(cat);
        animals.add(dog);
        animals.add(cat2);
        animals.add(new Rat());
        for (Animal animal:animals){ animal.speak();

        }
    }
}
