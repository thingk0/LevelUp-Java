package com.levelup.java._09_methods;

public class Utils {

    // 재귀 메소드
    public static int factorial(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    // 메소드 참조 예제
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    // 람다식 예제
    public static void printMessage(String message) {
        System.out.println(message);
    }

}