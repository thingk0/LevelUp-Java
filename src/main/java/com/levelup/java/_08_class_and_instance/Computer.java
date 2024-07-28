package com.levelup.java._08_class_and_instance;

import java.util.ArrayList;
import java.util.List;

public class Computer {

    private String name;
    private List<Component> components;

    public Computer(String name) {
        this.name = name;
        this.components = new ArrayList<>();
    }

    public void addComponent(Component component) {
        components.add(component);
    }

    @Override
    public String toString() {
        return "Computer{name='" + name + "', components=" + components + "}";
    }

}
