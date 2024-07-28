package com.levelup.java._08_class_and_instance;

public class Component {

    private String name;

    public Component(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Component{name='" + name + "'}";
    }

}
