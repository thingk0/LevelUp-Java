package com.levelup.java._11_exception_handling;

import com.levelup.java._11_exception_handling.exception.CustomException;

public class Main {

    public static void main(String[] args) {
        // Checked Exception 예제
        try {
            CheckedExceptionExample.readFile("존재하지 않는 파일.txt");
        } catch (Exception e) {
            System.out.println("Checked Exception 발생: " + e.getMessage());
        }

        // Unchecked Exception 예제
        try {
            UncheckedExceptionExample.divide(10, 0);
        } catch (ArithmeticException e) {
            System.out.println("Unchecked Exception 발생: " + e.getMessage());
        }

        // 사용자 정의 예외 예제
        try {
            CustomExceptionExample.checkValue(150);
        } catch (CustomException e) {
            System.out.println("Custom Exception 발생: " + e.getMessage());
        }

        // throw와 throws 키워드 예제
        try {
            CustomExceptionExample.throwCustomException();
        } catch (CustomException e) {
            System.out.println("Throw 예제: " + e.getMessage());
        } finally {
            System.out.println("Finally 블록 실행");
        }
    }
}