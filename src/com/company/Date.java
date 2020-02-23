package com.company;

import java.util.Scanner;

public class Date {
    public static void main (String [] args){
        System.out.println("Введите 3 числа через пробел в формате даты");
        Scanner scan = new Scanner(System.in);
        int day = scan.nextInt();
        int month = scan.nextInt();
        int year = scan.nextInt();
        if (((day>0) && (day <32)) && ((month == 1) || (month == 3) || (month == 5) || (month == 7) || (month == 8)
                || (month == 10) || (month == 12)) && ((year>0) && (year<2021))){
            System.out.println (day + "." + month + "." + year + " введенная дата является ревльной");}
            else if (((day>0) && (day <31)) && ((month == 4) || (month == 6) || (month == 9) || (month == 11)) &&
                    ((year>0) && (year<2021))){
            System.out.println (day + "." + month + "." + year + " введенная дата является ревльной");}
            else if ((day == 29) && (month == 2) && ((year % 400 == 0) || (year % 4 == 0) && (year % 100 != 0) &&
        (year>0) && (year<2021))){
            System.out.println (day + "." + month + "." + year + " введенная дата является ревльной"); }
            else if ((year % 400 != 0) || (year % 4 != 0) && (year % 100 == 0) &&
                (year > 0) && (year < 2021)) {
            if ((day == 28) && (month == 2)) {
                System.out.println(day + "." + month + "." + year + " введенная дата является ревльной");
            } else {
                System.out.println("Введенная дата не является реальной");
            }
        } else {
            System.out.println("Введенная дата не является реальной");
        }
            }

        }
