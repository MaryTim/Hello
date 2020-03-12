// Подсчитать количество слов в тексте. Учесть, что слова могут разделяться
//несколькими пробелами.

package l13;

import java.util.Scanner;

public class Text {

    public static void calculateWords () {

        String txt = "And she had never  been here before!   She realized it was the quiet place where the growing pheasants were reared "
                + "the keeper  in his   shirt‑sleeves was kneeling, hammering. The dog trotted forward with a short, sharp bark, " +
                "and the keeper lifted his face  suddenly and saw her. He had a startled look in his eyes.";

        Scanner scanner = new Scanner(txt);
        int count = 0;
        while(scanner.hasNext()) {
            scanner.next();
            count++;
        }

        System.out.println("The number of words in the text is " + count);
    }
}
