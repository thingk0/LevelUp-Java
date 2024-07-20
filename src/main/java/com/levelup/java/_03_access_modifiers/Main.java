package com.levelup.java._03_access_modifiers;

public class Main {

    public static void main(String[] args) {
        AccessModifiersExample example = new AccessModifiersExample();

        // 변수 접근 테스트
        System.out.println("Public variable: " + example.publicVar);
        // System.out.println("Private variable: " + example.privateVar); // 컴파일 에러: private 접근 불가
        System.out.println("Protected variable: " + example.protectedVar); // 같은 패키지이므로 접근 가능
        System.out.println("Default variable: " + example.defaultVar); // 같은 패키지이므로 접근 가능

        System.out.println("\n메서드 호출 테스트:");

        // 메서드 호출 테스트
        example.publicMethod();
        // example.privateMethod(); // 컴파일 에러: private 접근 불가
        example.protectedMethod(); // 같은 패키지이므로 접근 가능
        example.defaultMethod(); // 같은 패키지이므로 접근 가능

        // accessTest 메서드를 통한 모든 멤버 접근 테스트
        System.out.println("\naccessTest 메서드 호출 결과:");
        example.accessTest();
    }

}