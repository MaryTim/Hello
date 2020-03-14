// Написать программу, выполняющую поиск в строке
//шестнадцатеричных чисел, записанных по правилам Java,
//с помощью регулярных выражений и выводящую их на страницу.

package l14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HexadecimalNumbers {

    public static void findHexadecimalNumbers () {

        String string = "52CCF0632A6, HELLO 3643A03, 11011001000011101, 1022200121, AAAAA 331035003, 1071, A," +
                "14, 26, 6B";

        Pattern pattern = Pattern.compile("\\b[A-F0-9]+\\b");
        Matcher matcher = pattern.matcher(string);
        while (matcher.find()) {
            System.out.println("Hexadecimal number " + matcher.group());
        }
    }
}
