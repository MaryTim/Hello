// Написать свою реализацию интерфейса TemporalAdjuster,
//которая бы прибавляла к дате 42 дня

package l30;

import org.apache.log4j.Logger;

import java.time.LocalDate;
import java.util.Scanner;

public class Task11 {

    private static final Logger LOGGER = Logger.getLogger(Task11.class);

    public static void main (String[] args) {

        MyTemporalAdjuster mta = new MyTemporalAdjuster();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a date using the following format : YYYY-MM-DD");
        try {
            String date = scanner.nextLine();
            LocalDate parcedDate = LocalDate.parse(date);
            System.out.println(parcedDate);
            LocalDate plus42days = parcedDate.with(mta);
            System.out.println(plus42days);
        } catch (Exception e) {
            LOGGER.warn(e.getMessage());
        }
    }
}
