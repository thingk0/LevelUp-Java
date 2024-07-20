package com.levelup.java._01_variables_constants.extra_example;

import com.levelup.java.CommonUtils;

public class ConstantTest {

    public static void main(String[] args) {

        // 상수 선언 및 초기화
        final int A = 100;
        final double B = 3.14;
        final boolean C = true;
        final String D = "Hello, Everyone!";

        System.out.println("A = " + A);
        System.out.println("B = " + B);
        System.out.println("C = " + C);
        System.out.println("D = " + D);
        CommonUtils.splitLine();

        /*
        상수 값 변경 시도 (컴파일 에러)

        A = 1232972384;         -> 컴파일 에러: 상수는 값을 변경할 수 없습니다.
        B = 3.141592;           -> 컴파일 에러: 상수는 값을 변경할 수 없습니다.
        C = false;              -> 컴파일 에러: 상수는 값을 변경할 수 없습니다.
        D = "Hello, Java!";     -> 컴파일 에러: 상수는 값을 변경할 수 없습니다.

        */

        // 복수 상수 선언
        final int E, F, G, H;
        /*
         *   같은 타입의 상수를 여러 개 선언할 수 있습니다.
         *   상수의 목적이 같을 때만 사용해야 하며, 그렇지 않을 경우에는 각각의 상수를 별도로 선언하는 것이 좋습니다.
         */
        E = 1;
        F = 2;
        G = 3;
        H = 4;

        System.out.println("E = " + E);
        System.out.println("F = " + F);
        System.out.println("G = " + G);
        System.out.println("H = " + H);
        CommonUtils.splitLine();
    }

}
