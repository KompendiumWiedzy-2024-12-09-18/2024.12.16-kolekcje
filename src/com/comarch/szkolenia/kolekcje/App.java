package com.comarch.szkolenia.kolekcje;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        int[] tab = new int[10];
        System.out.println(tab);

        List<String> list = new ArrayList<>();

        m1(list);
        m2(list);
        m3(list);
    }

    public static void m1(List<String> list) {
        list.add("");
        list.size();
        list.remove("");
        list.get(5);
    }

    public static void m2(List<String> list) {
        //??
    }

    public static void m3(List<String> list) {
        //??
    }
}
