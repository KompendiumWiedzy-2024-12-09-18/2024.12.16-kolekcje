package com.comarch.szkolenia.kolekcje.listy;

import java.util.ArrayList;
import java.util.LinkedList;

public class App {
    public static void main(String[] args) {
        LinkedList<String> lista = new LinkedList<>();

        System.out.println(lista.size());

        lista.add("Mateusz");
        lista.add("Janusz");
        lista.add("Wiesiek");
        lista.add("Zbyszek");

        System.out.println(lista.size());

        lista.add(1, "Karol");

        System.out.println(lista);

        System.out.println(lista.get(0));
    }
}
