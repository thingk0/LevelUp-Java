package com.levelup.java._13_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListSample {

    public static void main(String[] args) {
        // ArrayList 생성
        List<String> 과일목록 = new ArrayList<>();

        // add(): 항목 추가
        과일목록.add("사과");
        과일목록.add("바나나");
        과일목록.add("체리");

        // addAll(): 여러 항목 한 번에 추가
        과일목록.addAll(Arrays.asList("딸기", "포도", "키위"));

        // size(): 리스트 크기 확인
        System.out.println("과일 목록의 크기: " + 과일목록.size());

        // toString(): 리스트 내용 출력
        System.out.println("과일 목록: " + 과일목록);

        // get(): 특정 인덱스의 항목 가져오기
        System.out.println("세 번째 과일: " + 과일목록.get(2));

        // set(): 특정 인덱스의 항목 변경
        과일목록.set(1, "망고");
        System.out.println("망고로 변경 후: " + 과일목록);

        // indexOf(): 항목의 인덱스 찾기
        System.out.println("체리의 인덱스: " + 과일목록.indexOf("체리"));

        // contains(): 항목 포함 여부 확인
        System.out.println("키위가 목록에 있나요? " + 과일목록.contains("키위"));

        // remove(): 특정 항목 제거
        과일목록.remove("포도");
        System.out.println("포도 제거 후: " + 과일목록);

        // sort(): 리스트 정렬 (기본: 오름차순)
        Collections.sort(과일목록);
        System.out.println("정렬 후: " + 과일목록);

        // subList(): 부분 리스트 가져오기
        List<String> 부분목록 = 과일목록.subList(1, 4);
        System.out.println("부분 목록 (인덱스 1~3): " + 부분목록);

        // toArray(): 리스트를 배열로 변환
        String[] 과일배열 = 과일목록.toArray(new String[0]);
        System.out.println("배열로 변환: " + Arrays.toString(과일배열));

        // clear(): 리스트 비우기
        과일목록.clear();
        System.out.println("목록을 비운 후 크기: " + 과일목록.size());

        // isEmpty(): 리스트가 비어있는지 확인
        System.out.println("리스트가 비어있나요? " + 과일목록.isEmpty());

        // 새로운 항목들 추가
        과일목록.addAll(Arrays.asList("복숭아", "자몽", "오렌지", "레몬", "복숭아"));

        // lastIndexOf(): 마지막으로 나타나는 항목의 인덱스 찾기
        System.out.println("마지막 복숭아의 인덱스: " + 과일목록.lastIndexOf("복숭아"));

        // retainAll(): 지정된 컬렉션에 포함된 항목만 유지
        과일목록.retainAll(Arrays.asList("복숭아", "오렌지"));
        System.out.println("복숭아와 오렌지만 유지 후: " + 과일목록);
    }
}