package com.levelup.java._09_methods;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {
        // 메소드 참조 및 람다식 예제
        List<String> names = Arrays.asList("홍길동", "김철수", "이영희");
        System.out.println("정렬 전: " + names);

        names.sort(String::compareTo);
        System.out.println("정렬 후: " + names);

        Predicate<String> startsWithKim = name -> name.startsWith("김");
        names.stream()
             .filter(startsWithKim)
             .forEach(System.out::println);

        // 재귀 메소드 예제
        int number = 5;
        System.out.println(number + "! = " + Utils.factorial(number));

        // 메소드 체이닝 예제
        Calculator calc = new Calculator();
        double result = calc.add(5)
                            .subtract(2)
                            .multiply(3)
                            .divide(2)
                            .getResult();

        System.out.println("계산 결과: " + result);
    }

}