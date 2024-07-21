package com.levelup.java._02_class_method.extra_example;

public class Product {

    String name;
    int price;

    Product() {
        this("티라미수케잌", 10000);
    }

    Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
            "name='" + name + '\'' +
            ", price=" + price +
            '}';
    }

}