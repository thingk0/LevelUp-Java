package com.levelup.java._14_optional;

import static com.levelup.java.CommonUtils.splitLine;

import java.util.Optional;

public class OptionalSample {

    public static void main(String[] args) {

        // Optional.of를 사용하여 non-null 값으로 Optional 생성
        Optional<String> nonNullValue = Optional.of("Hello, World!");
        System.out.println("Optional.of(nonNullValue) : " + nonNullValue);
        System.out.println("nonNullValue.get() : " + nonNullValue.get());
        splitLine();

        // Optional.empty 를 사용하여 빈 Optional 생성
        Optional<String> emptyValue = Optional.empty();
        System.out.println("Optional.empty: " + emptyValue);
        splitLine();

        // Optional.ofNullable 를 사용하여 null 가능 값으로 Optional 생성
        Optional<String> nullableValue = Optional.ofNullable(null);
        System.out.println("Optional.ofNullable (null): " + nullableValue);
        splitLine();

        nullableValue = Optional.ofNullable("Nullable value");
        System.out.println("Optional.ofNullable (not null): " + nullableValue);
        splitLine();

        // isPresent 를 사용하여 값이 존재하는지 확인
        System.out.println("nonNullValue is present: " + nonNullValue.isPresent());
        System.out.println("emptyValue is present: " + emptyValue.isPresent());
        splitLine();

        // ifPresent 를 사용하여 값이 존재할 때 동작 수행
        nonNullValue.ifPresent(value -> System.out.println("ifPresent: " + value));
        splitLine();

        // orElse 를 사용하여 기본값 반환
        System.out.println("emptyValue orElse: " + emptyValue.orElse("Default Value"));
        splitLine();

        // orElseGet 을 사용하여 기본값을 제공하는 Supplier 사용
        System.out.println("emptyValue orElseGet: " + emptyValue.orElseGet(() -> "Default from Supplier"));
        splitLine();

        // orElseThrow 를 사용하여 값이 없을 때 예외 발생
        try {
            emptyValue.orElseThrow(() -> new RuntimeException("Value is not present"));
        } catch (RuntimeException e) {
            System.out.println("orElseThrow: " + e.getMessage());
        }
        splitLine();

        // map 을 사용하여 값이 존재할 때 변환
        Optional<Integer> mappedValue = nonNullValue.map(String::length);
        System.out.println("map: " + mappedValue);
        splitLine();

        // flatMap 을 사용하여 중첩된 Optional 변환
        Optional<Optional<String>> nestedOptional = Optional.of(Optional.of("Nested value"));
        Optional<String> flatMappedValue = nestedOptional.flatMap(opt -> opt);
        System.out.println("flatMap: " + flatMappedValue);
        splitLine();

        // filter 를 사용하여 조건에 따라 값 필터링
        Optional<String> filteredValue = nonNullValue.filter(value -> value.startsWith("Hello"));
        System.out.println("filter (starts with 'Hello'): " + filteredValue);
        splitLine();

        filteredValue = nonNullValue.filter(value -> value.startsWith("Goodbye"));
        System.out.println("filter (starts with 'Goodbye'): " + filteredValue);
        splitLine();
    }

}
