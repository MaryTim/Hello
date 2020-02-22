package com.company;

import java.util.Scanner;

public class Rubles {
    public static void main(String[] args) {
        System.out.println("Введите число");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        if ((number % 10 == 4) || (number % 10 == 3) || (number % 10 == 2)) {
            System.out.println(number + " рубля"); }
        else if ((number == 11)) {
            System.out.println(number + " рублей");}
        else if ((number % 10 == 5) || (number % 10 == 6) || (number % 10 == 7) || (number % 10 == 8) || (number % 10 == 9) ||
                (number % 10 == 0)) {
            System.out.println(number + " рублей");
        } else {
            System.out.println(number + " рубль");
        }
    }
}
