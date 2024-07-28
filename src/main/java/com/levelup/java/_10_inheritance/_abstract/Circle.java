package com.levelup.java._10_inheritance._abstract;

public class Circle extends Shape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("원을 그립니다.");
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

}