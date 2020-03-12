package l13;

public class Words {

    public static boolean checkLine () {

        String word = "Hello";
        String phrase = "Hello, my fiend! Hello";

        return (phrase.startsWith(word)) && ((phrase.endsWith(word)));
    }
}
