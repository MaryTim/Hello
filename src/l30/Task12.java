package l30;

import org.apache.log4j.Logger;

import java.time.LocalDate;
import java.util.Scanner;

public class Task12 {

    private static final Logger LOGGER = Logger.getLogger(Task12.class);

    public static void main (String[] args) {

        January1 jan = new January1();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a date using the following format : YYYY-MM-DD");

        try {
            String date = scanner.nextLine();
            LocalDate parcedDate = LocalDate.parse(date);
            System.out.println(parcedDate);
            LocalDate transformedDate = parcedDate.with(jan);
            System.out.println(transformedDate);
        } catch (Exception e) {
            LOGGER.warn(e.getMessage());
        }
    }
}
