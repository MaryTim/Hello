// Создать объект LocalDate,
//представляющий собой сегодняшнюю
//дату. Преобразовать дату в строку вида "05.05.2017".
//Вывести эту строку в консоль

package l30;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Task7 {
    public static void main (String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println(today);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        System.out.println(dtf.format(today));
    }
}
