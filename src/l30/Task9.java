//Создать объект LocalDate, представляющий собой сегодняшнюю
//дату. Создать объект LocalDate, представляющий собой дату
//25.06.2020. Используя созданные объекты, найти количество
//дней между этими двумя датами.

package l30;

import java.time.LocalDate;
import java.time.Period;

import static java.time.temporal.ChronoUnit.DAYS;

public class Task9 {
    public static void main (String[] args) {

        LocalDate today = LocalDate.now();
        System.out.println(today);
        LocalDate future = LocalDate.of(2020 , 06 , 25);
        System.out.println(future);
        Period period = Period.between(today , future);

        int years = period.getYears();
        int months = period.getMonths();
        int days = period.getDays();
        System.out.println(years + " years " + months + " months " + days + " days");
        System.out.println("Days in total: " + DAYS.between(today , future));

    }
}
