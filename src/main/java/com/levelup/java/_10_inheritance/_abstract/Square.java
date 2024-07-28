package com.levelup.java._10_inheritance._abstract;

public class Square extends Shape {

    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("사각형을 그립니다.");
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

}