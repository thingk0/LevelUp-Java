package com.levelup.java._02_class_method.data;

public class Character {

    String name;            // 캐릭터의 이름
    int level;              // 캐릭터의 레벨
    int hp;                 // 캐릭터의 체력
    int attackDamage;       // 캐릭터의 공격력
    int abilityPower;       // 캐릭터의 능력치

    public Character() {
        this("Unknown");
    }

    public Character(String name) {
        this(name, 1, 100, 10, 10);
    }

    public Character(String name,
                     int level,
                     int hp,
                     int attackPower,
                     int abilityPower
    ) {
        this.name = name;
        this.level = level;
        this.hp = hp;
        this.attackDamage = attackPower;
        this.abilityPower = abilityPower;
    }

    @Override
    public String toString() {
        return "Character{" +
            "name='" + name + '\'' +
            ", level=" + level +
            ", hp=" + hp +
            ", attackDamage=" + attackDamage +
            ", abilityPower=" + abilityPower +
            '}';
    }

}
