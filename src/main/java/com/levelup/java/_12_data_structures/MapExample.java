package com.levelup.java._12_data_structures;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

    public static void showMap() {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "홍길동");
        map.put(2, "김철수");
        map.put(3, "이영희");

        System.out.println("맵 요소:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("키: " + entry.getKey() + ", 값: " + entry.getValue());
        }
    }

}