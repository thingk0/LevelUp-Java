package com.levelup.java._04_static;

import com.levelup.java.CommonUtils;

public class Main {

    private final int NON_STATIC_MAX_NUM = Integer.MAX_VALUE;
    private static final int STATIC_MAX_NUM = Integer.MAX_VALUE;

    public static void main(String[] args) {
        System.out.println("STATIC_MAX_NUM = " + STATIC_MAX_NUM);
        // System.out.println("NON_STATIC_MAX_NUM = " + NON_STATIC_MAX_NUM); // 컴파일 에러: static 컨텍스트에서 non-static 멤버 접근 불가

        classMethod();
        // instanceMethod(); // 컴파일 에러: static 컨텍스트에서 non-static 메서드 호출 불가

        Main main = new Main();

        Person hong = main.new Person("홍길동", 15);
        System.out.println("홍길동 = " + hong);

        Person unknownPerson = main.new Person();
        System.out.println("그냥인간 = " + unknownPerson);

        StaticPerson kiYoung = new StaticPerson("기영이", 10);
        System.out.println("기영이 = " + kiYoung);

        StaticPerson staticPerson = new StaticPerson();
        System.out.println("스태틱인간 = " + staticPerson);

        CommonUtils.splitLine();

        CommonUtils commonUtils = new CommonUtils();
        commonUtils.splitLine();

    }

    private void instanceMethod() {
        System.out.println("인스턴스 메서드입니다.");
    }

    private static void classMethod() {
        System.out.println("클래스 메서드입니다.");
    }

    class Person {

        String name;
        int age;

        public Person() {
            this(null, 0);
        }

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
        }

    }

    static class StaticPerson {

        String name;
        int age;

        public StaticPerson() {
            this(null, 0);
        }

        public StaticPerson(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "StaticPerson{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
        }

    }

}
