// Написать программу, проверяющую, является ли введённая
// строка адресом электронного почтового ящика. В названии
// почтового ящика разрешить использование только букв,
// цифр и нижних подчёркиваний, при этом оно должно
// начинаться с буквы. Возможные домены верхнего уровня:
// .org .com

package l14;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Email {

    public static void checkEmail () {

        System.out.println("Please enter your e-mail");
        Scanner scanner = new Scanner(System.in);
        String email = scanner.next();
        Pattern p = Pattern.compile("\\b[a-zA-Z]\\w+@[a-z]+(.org|.com)\\b");
        Matcher matcher = p.matcher(email);
        if (matcher.find()) {
            System.out.println( "e-mail: " + matcher.group());
        } else {
            System.out.println("Incorrect format");
        }
    }
}
