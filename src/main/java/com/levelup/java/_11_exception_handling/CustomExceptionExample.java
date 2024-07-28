package com.levelup.java._11_exception_handling;

import com.levelup.java._11_exception_handling.exception.CustomException;

public class CustomExceptionExample {

    public static void checkValue(int value) throws CustomException {
        if (value > 100) {
            throw new CustomException("값이 100을 초과합니다: " + value);
        }
    }

    public static void throwCustomException() throws CustomException {
        throw new CustomException("강제 발생된 사용자 정의 예외");
    }

}