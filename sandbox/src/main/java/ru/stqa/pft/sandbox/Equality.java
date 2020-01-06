package ru.stqa.pft.sandbox;

public class Equality {
    public static void main(String[] args) {
        String s1 = "firefox";
        String s2 = s1; //проверяет, что ссылки на объект одинаковые, но если создать новый объект, результат будет false т.к. ссылки не совпадают
        System.out.println(s1 == s2); //сравнение именно ссылок на объект
        System.out.println(s1.equals(s2));// сравнение содержимого объекта
    }
}
