package com.levelup.java._12_data_structures;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

    public static void showSet() {
        Set<String> set = new HashSet<>();
        set.add("홍길동");
        set.add("김철수");
        set.add("이영희");
        set.add("홍길동"); // 중복 요소는 추가되지 않음

        System.out.println("셋 요소:");
        for (String name : set) {
            System.out.println(name);
        }
    }

}