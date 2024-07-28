package com.levelup.java._12_data_structures;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

    public static void showList() {
        List<String> names = new ArrayList<>();
        names.add("홍길동");
        names.add("김철수");
        names.add("이영희");

        System.out.println("리스트 요소:");
        for (String name : names) {
            System.out.println(name);
        }
    }

}