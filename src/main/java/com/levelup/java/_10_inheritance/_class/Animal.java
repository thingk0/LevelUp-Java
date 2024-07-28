package com.levelup.java._10_inheritance._class;

public class Animal {

    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public void makeSound() {
        System.out.println("동물이 소리를 냅니다.");
    }

}