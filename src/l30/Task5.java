//Создать объект класса LocalDate, представляющий собой
//дату 25.06.2020. Вывести полученную дату в консоль

package l30;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Task5 {
    
    public static void main (String[] args) {

        LocalDate date = LocalDate.of(2020 , 6 , 25);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        System.out.println(formatter.format(date));
    }
}
