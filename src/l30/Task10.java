// Даны два объекта LocalDate из предыдущего задания.
//Подсчитать количество секунд между полуночью первой даты и
//полуночью второй даты.

package l30;

import java.time.LocalDate;
import java.time.LocalDateTime;

import static java.time.temporal.ChronoUnit.SECONDS;

public class Task10 {
    public static void main (String[] args) {

        LocalDateTime today = LocalDate.now().atStartOfDay();
        System.out.println(today);
        LocalDateTime future = LocalDate.of(2020 , 06 , 25).atStartOfDay();
        System.out.println(future);
        System.out.println("Seconds in total: " + SECONDS.between(today , future));

    }
}
