package com.levelup.java._08_class_and_instance;

import java.util.ArrayList;
import java.util.List;

public class Team {

    private String name;
    private List<Person> members;

    public Team(String name) {
        this.name = name;
        this.members = new ArrayList<>();
    }

    public void addMember(Person person) {
        members.add(person);
    }

    @Override
    public String toString() {
        return "Team{name='" + name + "', members=" + members + "}";
    }

}
