package com.levelup.java._08_class_and_instance;

public class Person {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public void showDetails() {
        System.out.println("Person's name: " + this.name);
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "'}";
    }

}
