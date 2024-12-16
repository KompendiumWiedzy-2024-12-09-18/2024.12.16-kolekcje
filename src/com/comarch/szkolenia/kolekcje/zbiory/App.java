package com.comarch.szkolenia.kolekcje.zbiory;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class App {
    public static void main(String[] args) {
        TreeSet<String> names = new TreeSet<>();

        names.add("Mateusz");
        System.out.println(names);
        names.add("Mateusz");
        System.out.println(names);

        names.add("Karol");
        names.add("Zbyszek");
        names.add("Wiesiek");
        names.add("Adam");
        names.add("Janusz");

        System.out.println(names);

        for(String element : names) {
            System.out.println(element);
        }

        names.contains("Janusz");

        ArrayList<String> list = new ArrayList<>(names);
    }
}
