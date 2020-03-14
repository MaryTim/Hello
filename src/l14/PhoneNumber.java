// Написать программу, выполняющую поиск в строке мобильных
//телефонных номеров в формате +375XXYYYYYYY.
//и заменяющую каждый телефон на тот же, но в формате
//+375 (XX)YYY-YY-YY. X - код оператора. Y - номер телефона

package l14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumber {

    public static void changeFormat () {

        String numbers = " +8613258166880 +4792837492 +375291278588 +375291883444 287364738745 +37529111990 +375440980000";

        Pattern pattern = Pattern.compile("([+]375)(\\d\\d)(\\d\\d\\d)(\\d\\d)(\\d\\d)\\b");
        Matcher matcher = pattern.matcher(numbers);

        while (matcher.find()) {
            System.out.println( "phone number: " + matcher.group(1) + "(" + matcher.group(2) + ")" + matcher.group(3) + "-" +
                    matcher.group(4) + "-" + matcher.group(5));
        }
    }
}
