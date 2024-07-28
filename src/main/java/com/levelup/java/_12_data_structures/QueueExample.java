package com.levelup.java._12_data_structures;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

    public static void showQueue() {
        Queue<String> queue = new LinkedList<>();
        queue.add("첫 번째");
        queue.add("두 번째");
        queue.add("세 번째");

        System.out.println("큐 요소:");
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }

}