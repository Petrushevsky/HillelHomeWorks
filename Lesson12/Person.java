package com.hillel.homework.Lesson4.Lesson12;

public class Person {
    private String name;
    private int age;
    private static final String DEFAULT_NAME = "Unknown";
    public static int COUNT = 0;
    public Person(int age){
        this.name = DEFAULT_NAME;
        this.age = age;
        COUNT+=1;
    }
    public Person( String name, int age){
        this.name = name;
        this.age = age;
        COUNT+=1;
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
public void setAge(int age){
        this.age = age;
}

    @Override
    public String toString () {
        return "Person name = " + name + ", age " + age;
    }
}
