package com.levelup.java._13_collections;

import java.util.*;

public class SetSample {

    public static void main(String[] args) {
        // HashSet 생성
        Set<String> 과일세트 = new HashSet<>();

        // add(): 항목 추가
        과일세트.add("사과");
        과일세트.add("바나나");
        과일세트.add("체리");
        과일세트.add("사과"); // 중복 항목 - 무시됨

        // size(): 세트 크기 확인
        System.out.println("과일 세트의 크기: " + 과일세트.size());

        // toString(): 세트 내용 출력
        System.out.println("과일 세트: " + 과일세트);

        // contains(): 항목 포함 여부 확인
        System.out.println("바나나가 세트에 있나요? " + 과일세트.contains("바나나"));

        // remove(): 항목 제거
        과일세트.remove("체리");
        System.out.println("체리 제거 후: " + 과일세트);

        // addAll(): 여러 항목 한 번에 추가
        과일세트.addAll(Arrays.asList("딸기", "포도", "키위"));
        System.out.println("새 과일 추가 후: " + 과일세트);

        // iterator(): 반복자를 이용한 순회
        System.out.println("iterator()를 이용한 순회:");
        Iterator<String> iterator = 과일세트.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // 향상된 for 문을 이용한 순회
        System.out.println("향상된 for 문을 이용한 순회:");
        for (String 과일 : 과일세트) {
            System.out.println(과일);
        }

        // toArray(): 세트를 배열로 변환
        String[] 과일배열 = 과일세트.toArray(new String[0]);
        System.out.println("배열로 변환: " + Arrays.toString(과일배열));

        // clear(): 세트 비우기
        과일세트.clear();
        System.out.println("세트를 비운 후 크기: " + 과일세트.size());

        // isEmpty(): 세트가 비어있는지 확인
        System.out.println("세트가 비어있나요? " + 과일세트.isEmpty());

        // 집합 연산 예제
        Set<String> 세트1 = new HashSet<>(Arrays.asList("사과", "바나나", "체리"));
        Set<String> 세트2 = new HashSet<>(Arrays.asList("바나나", "딸기", "포도"));

        // union (합집합)
        Set<String> 합집합 = new HashSet<>(세트1);
        합집합.addAll(세트2);
        System.out.println("합집합: " + 합집합);

        // intersection (교집합)
        Set<String> 교집합 = new HashSet<>(세트1);
        교집합.retainAll(세트2);
        System.out.println("교집합: " + 교집합);

        // difference (차집합)
        Set<String> 차집합 = new HashSet<>(세트1);
        차집합.removeAll(세트2);
        System.out.println("차집합 (세트1 - 세트2): " + 차집합);
    }
}