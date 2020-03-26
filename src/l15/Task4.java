package l15;

import org.apache.log4j.Logger;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task4 {

    private static final Logger LOGGER = Logger.getLogger(Task4.class);

    public static void main (String[] args) {

        Pattern pattern = Pattern.compile("\\b\\d+\\b");
        String str = "";
        int quantity = 0;
        try (BufferedReader br = new BufferedReader(new FileReader("src" + File.separator + "l15" + File.separator + "TextAndNumbers"))) {
            String line;
            while((line = br.readLine()) != null) {
                Matcher matcher = pattern.matcher(line);
                while(matcher.find()) {
                    if (matcher.group().length() > quantity) {
                        quantity = matcher.group().length();
                        str = matcher.group();
                    }
                        System.out.print(matcher.group() + "  ");
                }
                System.out.println("\n" + str + " - " + quantity + " numerals");
                System.out.println( );
                str = "";
                quantity = 0;
            }
        } catch (IOException e) {
            LOGGER.warn(e);
        }
    }
}
