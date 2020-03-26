package l15;

import org.apache.log4j.Logger;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {

    private static final Logger LOGGER = Logger.getLogger(Task2.class);

    public static void main (String[] args) throws IOException {

        File myFile = new File("src" + File.separator + "l15" + File.separator + "Example");
        Pattern pattern = Pattern.compile("\\b[a||A||i||I||e||E||o||O||u||U]\\w*");

        if ( myFile.exists() ) {
            try (BufferedReader in = new BufferedReader(new FileReader(myFile))) {
                String str = "";
                while((str = in.readLine()) != null) {
                   Matcher matcher = pattern.matcher(str);
                   while (matcher.find())
                       System.out.println(matcher.group());
                }

            } catch (IOException ex) {
                LOGGER.warn(ex);
            }
        }
    }
}
