package com.levelup.java._13_collections;

import java.util.*;

public class MapSample {

    public static void main(String[] args) {
        // HashMap 생성
        Map<String, Integer> 과일가격 = new HashMap<>();

        // put(): 키-값 쌍 추가
        과일가격.put("사과", 1000);
        과일가격.put("바나나", 1500);
        과일가격.put("체리", 2000);

        // size(): 맵 크기 확인
        System.out.println("과일 종류 수: " + 과일가격.size());

        // get(): 키로 값 조회
        System.out.println("사과의 가격: " + 과일가격.get("사과") + "원");

        // containsKey(): 키 존재 여부 확인
        System.out.println("망고가 목록에 있나요? " + 과일가격.containsKey("망고"));

        // containsValue(): 값 존재 여부 확인
        System.out.println("1500원짜리 과일이 있나요? " + 과일가격.containsValue(1500));

        // remove(): 키-값 쌍 제거
        과일가격.remove("체리");
        System.out.println("체리 제거 후: " + 과일가격);

        // putIfAbsent(): 키가 없을 때만 값 추가
        과일가격.putIfAbsent("딸기", 2500);
        과일가격.putIfAbsent("사과", 1200); // 이미 존재하므로 무시됨
        System.out.println("putIfAbsent 후: " + 과일가격);

        // keySet(): 모든 키 조회
        System.out.println("모든 과일: " + 과일가격.keySet());

        // values(): 모든 값 조회
        System.out.println("모든 가격: " + 과일가격.values());

        // entrySet(): 모든 키-값 쌍 조회
        System.out.println("모든 과일과 가격:");
        for (Map.Entry<String, Integer> entry : 과일가격.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + "원");
        }

        // getOrDefault(): 키가 없을 때 기본값 반환
        System.out.println("망고의 가격: " + 과일가격.getOrDefault("망고", 0) + "원");

        // replace(): 키의 값 변경
        과일가격.replace("바나나", 1800);
        System.out.println("바나나 가격 변경 후: " + 과일가격);

        // clear(): 맵 비우기
        과일가격.clear();
        System.out.println("맵을 비운 후 크기: " + 과일가격.size());

        // isEmpty(): 맵이 비어있는지 확인
        System.out.println("맵이 비어있나요? " + 과일가격.isEmpty());

        // 람다식을 이용한 맵 조작
        과일가격.put("사과", 1000);
        과일가격.put("바나나", 1500);

        // compute(): 키의 값을 계산하여 업데이트
        과일가격.compute("사과", (k, v) -> (v == null) ? 1000 : v + 200);
        System.out.println("사과 가격 계산 후: " + 과일가격);

        // computeIfAbsent(): 키가 없을 때만 값을 계산하여 추가
        과일가격.computeIfAbsent("망고", k -> 2000);
        System.out.println("망고 추가 후: " + 과일가격);

        // computeIfPresent(): 키가 있을 때만 값을 계산하여 업데이트
        과일가격.computeIfPresent("바나나", (k, v) -> v + 300);
        System.out.println("바나나 가격 업데이트 후: " + 과일가격);

        // merge(): 키의 값을 병합
        과일가격.merge("사과", 500, (oldValue, newValue) -> oldValue + newValue);
        System.out.println("사과 가격 병합 후: " + 과일가격);
    }
}