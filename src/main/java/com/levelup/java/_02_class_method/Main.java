package com.levelup.java._02_class_method;

import static com.levelup.java.CommonUtils.splitLine;

import com.levelup.java._02_class_method.data.Character;

public class Main {

    public static void main(String[] args) {

        splitLine();
        Character unknown = new Character();
        System.out.println(unknown);

        splitLine();
        Character evan = new Character("Evan");
        System.out.println(evan);

        splitLine();
        String name = "Sophia";
        int level = 1;
        int hp = 1000;
        int attackDamage = 10;
        int abilityPower = 10;
        Character sophia = new Character(name, level, hp, attackDamage, abilityPower);
        System.out.println(sophia);

        splitLine();
    }

}