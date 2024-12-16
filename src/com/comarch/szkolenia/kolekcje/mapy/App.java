package com.comarch.szkolenia.kolekcje.mapy;

import java.util.HashMap;

public class App {
    public static void main(String[] args) {
        HashMap<Integer, String> mapa = new HashMap<>();
        mapa.put(5, "Janusz");
        mapa.put(2, "Wiesiek");
        mapa.put(7, "Mateusz");

        mapa.get(5);
        mapa.get(2);
        mapa.get(7);

        HashMap<String, String> mapa2 = new HashMap<>();
        mapa2.put("db.host", "12.12.12.12");
        mapa2.put("db.user", "admin");

        System.out.println(mapa2.get("db.user"));
    }
}
