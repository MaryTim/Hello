package l17;

import java.util.List;
import java.util.stream.Collectors;

public class Task4 {
    public static void main (String[] args) {
        List<Integer> list = List.of(5, 21, 4, 8, 11, 3);
            String result = list.stream()
                .map(number -> number.toString())
                .collect(Collectors.joining());
        System.out.println("The string is " + result);
    }
}
