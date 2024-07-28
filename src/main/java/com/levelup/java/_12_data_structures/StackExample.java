package com.levelup.java._12_data_structures;

import java.util.Stack;

public class StackExample {

    public static void showStack() {
        Stack<String> stack = new Stack<>();
        stack.push("첫 번째");
        stack.push("두 번째");
        stack.push("세 번째");

        System.out.println("스택 요소:");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }

}