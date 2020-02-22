package com.company;

import java.util.Scanner;

public class LeapLeap {
    public static void main(String[] args) {
        System.out.println("Введите год, который Вас интересует");
        Scanner scan = new Scanner(System.in);
        int year = scan.nextInt();
        if ((year % 400 == 0) || (year % 4 == 0) && (year % 100 != 0)) {
            System.out.println(year + "год является високосным");
        } else {
            System.out.println(year + "год не является високосным");

        }
    }
}
