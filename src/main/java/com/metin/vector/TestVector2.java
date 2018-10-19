package com.metin.vector;

import java.util.Vector;

public class TestVector2 {

    public static void main(String[] args) {

        Vector<String> vector = new Vector<String>();

        vector.add("1");
        vector.add("2");
        vector.add("3");
        vector.add("4");
        vector.add("5");
        vector.add("6");
        vector.add("7");
        vector.add("8");
        vector.add("9");
        vector.add("10");
        vector.add("11");

        vector.forEach(System.out::println);

        System.out.println("------------------");

        vector.add(5, "yeni kayıt");

        vector.forEach(System.out::println);
    }
}
