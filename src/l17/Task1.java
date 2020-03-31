package l17;

import java.util.List;

public class Task1 {
    public static void main (String[] args) {
        List<Integer> numbers = List.of(5 , 10 , 12 , 25 , 22 , 55 , 56 , 67 , 20 , 6);
        double result = numbers.stream()
                .filter(number -> number % 2 != 0 && number % 5 == 0)
                .mapToInt(number -> number)
                .average().orElse(0);
        System.out.println("The average is " + result);

    }
}
