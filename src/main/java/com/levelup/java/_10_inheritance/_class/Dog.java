package com.levelup.java._10_inheritance._class;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(name + "가 멍멍 짖습니다.");
    }

}