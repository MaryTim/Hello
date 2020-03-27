// Дана строка вида "26-03-2014". Получить объект LocalDate,
//представляющий собой дату, полученную из этой строки.

package l30;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Task8 {
    public static void main (String[] args) {

        String date = "26-03-2014";
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate parsedDate = LocalDate.parse(date , dtf);
        System.out.println(parsedDate);
        System.out.println(dtf.format(parsedDate));
    }
}
