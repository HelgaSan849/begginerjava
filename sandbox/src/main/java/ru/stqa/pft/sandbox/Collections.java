package ru.stqa.pft.sandbox;

import java.util.ArrayList;
import java.util.List;

public class Collections {
    public static  void main(String[] args) {
        String[] langs = {"Java", "C#", "Python", "PHP"};
        List<String> languages = new ArrayList<String>();
        languages.add("Java");

        for (String l : langs) {//если заменить langs на languages, чтобы перечислить languages
            System.out.println("Я хочу выучить " + l);
        }

    }
}
