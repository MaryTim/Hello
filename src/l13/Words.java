// Написать функцию, принимающую 2 параметра: строку и слово -
//и возвращающую true, если строка начинается и заканчивается этим словом

package l13;

public class Words {

    public static boolean checkLine () {

        String word = "Hello";
        String phrase = "Hello, my fiend! Hello";

        return (phrase.startsWith(word)) && ((phrase.endsWith(word)));
    }
}
