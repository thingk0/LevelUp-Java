package com.levelup.java._09_methods;

public class Calculator {

    private double value;

    public Calculator() {
        this.value = 0;
    }

    public Calculator add(double value) {
        this.value += value;
        return this;
    }

    public Calculator subtract(double value) {
        this.value -= value;
        return this;
    }

    public Calculator multiply(double value) {
        this.value *= value;
        return this;
    }

    public Calculator divide(double value) {
        if (value != 0) {
            this.value /= value;
        } else {
            System.out.println("0으로 나눌 수 없습니다.");
        }
        return this;
    }

    public double getResult() {
        return this.value;
    }

}