package com.levelup.java._03_access_modifiers;

public class AccessModifiersExample {

    public int publicVar = 1;
    private int privateVar = 2;
    protected int protectedVar = 3;
    int defaultVar = 4;

    public void publicMethod() {
        System.out.println("Public method");
    }

    private void privateMethod() {
        System.out.println("Private method");
    }

    protected void protectedMethod() {
        System.out.println("Protected method");
    }

    void defaultMethod() {
        System.out.println("Default method");
    }

    public void accessTest() {
        System.out.println("Public: " + publicVar);
        System.out.println("Private: " + privateVar);
        System.out.println("Protected: " + protectedVar);
        System.out.println("Default: " + defaultVar);

        publicMethod();
        privateMethod();
        protectedMethod();
        defaultMethod();
    }

}

// 같은 패키지의 다른 클래스
class SamePackageClass {

    public void testAccess() {
        AccessModifiersExample example = new AccessModifiersExample();
        System.out.println("Public: " + example.publicVar);
        // System.out.println("Private: " + example.privateVar); // 컴파일 에러
        System.out.println("Protected: " + example.protectedVar);
        System.out.println("Default: " + example.defaultVar);

        example.publicMethod();
        // example.privateMethod(); // 컴파일 에러
        example.protectedMethod();
        example.defaultMethod();
    }

}

// 다른 패키지의 클래스를 시뮬레이션
class OtherPackageClass {

    public void testAccess() {
        AccessModifiersExample example = new AccessModifiersExample();
        System.out.println("Public: " + example.publicVar);
        // 아래 라인들은 실제로는 컴파일 에러가 발생합니다.
        // System.out.println("Private: " + example.privateVar);
        // System.out.println("Protected: " + example.protectedVar);
        // System.out.println("Default: " + example.defaultVar);

        example.publicMethod();
        // 아래 메서드 호출들은 실제로는 컴파일 에러가 발생합니다.
        // example.privateMethod();
        // example.protectedMethod();
        // example.defaultMethod();
    }

}