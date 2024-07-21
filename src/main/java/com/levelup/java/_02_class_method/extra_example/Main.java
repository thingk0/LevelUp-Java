package com.levelup.java._02_class_method.extra_example;

public class Main {

    public static void main(String[] args) {

        int num = 3;
        System.out.println("num = " + num);

        Product product1 = new Product();
        product1.name = "망원동 티라미수 케잌";
        System.out.println("product1 = " + product1);

        Product product2 = new Product();
        product2.price = 30000;
        System.out.println("product2 = " + product2);

        Product product3 = new Product();
        product3.name = "T라 미숙해";
        product3.price = 500000;
        System.out.println("product3 = " + product3);

        Product p1 = new Product();
        System.out.println("p1 = " + p1);
        Product p2 = new Product();
        System.out.println("p2 = " + p2);
        System.out.println("p1 == p2 ? " + p1.equals(p2));

    }

}