// Создать объект LocalDate, представляющий собой сегодняшнюю
//дату. Используя этот объект, создать другой объект LocalTime,
//представляющий собой дату через 3 месяца после сегодняшней.
//Вывести эту дату в консоль.

package l30;

import java.time.LocalDate;

public class Task6 {
    public static void main (String[] args) {

        LocalDate today = LocalDate.now();
        System.out.println(today);
        LocalDate future = today.plusMonths(3);
        System.out.println(future);
    }
}
