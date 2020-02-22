package com.company;

import java.util.Scanner;

public class TwoWords {
    public static void main(String[] args) {
        System.out.println("Введите два слова через пробел");
        Scanner scan = new Scanner(System.in);
        String word1 = scan.next();
        String word2 = scan.next();
        if (word1.equals(word2)) {
            System.out.println("Отлично! Слова одинаковы");
        } else if (word1.equalsIgnoreCase(word2)) {
            System.out.println("Хорошо. Почти одинаковы");
        } else if (word1.length() == word2.length())
            System.out.println("Ну, хотя бы они одной длины");
        else
            System.out.println("Слова совершенно разные");
    }
}
