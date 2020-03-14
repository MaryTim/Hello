// Написать метод, который проверяет, является ли строка адресом IPv4

package l14;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IPv4 {

    public static void checkIPv4 () {

        System.out.println("Please enter IPv4 address");
        Scanner scanner = new Scanner(System.in);
        String ipv4 = scanner.next();
        Pattern p = Pattern.compile("^((\\d|([1-9]\\d)|(1\\d\\d)|(2[0-5][0-5]))\\.){3}(0|([1-9]\\d?)|(1\\d\\d)|(2[0-5][0-5]))$");
        Matcher m = p.matcher(ipv4);
        if (m.find()) {
            System.out.println("IPv4 address is " + ipv4);
        } else {
            System.out.println("Incorrect IPv4 address");
        }
    }
}
