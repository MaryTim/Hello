package l17;

import java.util.List;

public class Task2 {
    public static void main (String[] args) {
        List<String> words = List.of("gentleness" , "responsibility", "patience", "luck", "responsibility", "generosity" ,
                "sincerity" );
        long quantity = words.stream()
                .filter(word -> word.length()>8)
                .distinct()
                .count();
        System.out.println("The quantity of unique words with more than 8 symbols is " + quantity);

    }
}
