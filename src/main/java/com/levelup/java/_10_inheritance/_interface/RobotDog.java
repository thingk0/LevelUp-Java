package com.levelup.java._10_inheritance._interface;

public class RobotDog implements Runnable, Swimmable {

    @Override
    public void run() {
        System.out.println("로봇 강아지가 달립니다.");
    }

    @Override
    public void swim() {
        System.out.println("로봇 강아지가 수영합니다.");
    }

}