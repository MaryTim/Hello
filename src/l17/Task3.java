package l17;

import java.util.Map;

public class Task3 {
    public static void main (String[] args) {
        Map<String, Integer> map= Map.of("gentleness", 5, "luck", 8, "patience", 10,
                "charm", 6, "glory", 9);
        long result = map.entrySet()
                .stream()
                .filter(entry -> entry.getKey().length() < 7)
                .mapToLong(Map.Entry::getValue)
                .sum();
        System.out.println("The sum of values is " + result);
    }
}
