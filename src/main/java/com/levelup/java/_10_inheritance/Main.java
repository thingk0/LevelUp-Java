package com.levelup.java._10_inheritance;

import com.levelup.java._10_inheritance._abstract.Circle;
import com.levelup.java._10_inheritance._abstract.Shape;
import com.levelup.java._10_inheritance._abstract.Square;
import com.levelup.java._10_inheritance._class.Dog;
import com.levelup.java._10_inheritance._interface.RobotDog;
import com.levelup.java._10_inheritance._interface.Runnable;

public class Main {

    public static void main(String[] args) {
        // 상속 예제
        Dog dog = new Dog("바둑이");
        dog.makeSound();

        // 인터페이스 및 다중 상속 예제
        RobotDog robotDog = new RobotDog();
        robotDog.run();
        robotDog.swim();

        // 추상 클래스 예제
        Shape circle = new Circle(5);
        Shape square = new Square(4);
        circle.draw();
        square.draw();
        System.out.println("Circle Area: " + circle.calculateArea());
        System.out.println("Square Area: " + square.calculateArea());

        // 익명 클래스 예제
        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("익명 클래스의 run 메소드 실행");
            }
        };
        runnable1.run();

        // 람다 표현식 예제
        Runnable runnable2 = () -> System.out.println("익명 클래스의 run 메소드 실행");
        runnable2.run();

    }

}