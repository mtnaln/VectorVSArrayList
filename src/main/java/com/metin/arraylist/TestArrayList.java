package com.metin.arraylist;

import java.util.ArrayList;
import java.util.List;

public class TestArrayList {

    public static void main(String[] args) {

        List<String> arrayList = new ArrayList<String>();

        arrayList.add("1");
        arrayList.add("2");

        arrayList.add(1, "yeni kayıt");

        arrayList.remove(0);

        arrayList.forEach(System.out::println);
    }
}
