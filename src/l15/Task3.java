package l15;

import org.apache.log4j.Logger;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Task3 {

    private static final Logger LOGGER = Logger.getLogger(Task3.class);

    public static void main (String[] args) throws IOException {

        File myFile = new File("src" + File.separator + "l15" + File.separator + "Example");
        try (BufferedReader in = new BufferedReader(new FileReader(myFile))) {

           String str = "";
           while((str = in.readLine()) != null) {
               String[] words = str.split("\\s");

               for (int i = 0; i < words.length - 1; i++) {
                   if ( words[ i ].charAt(words[ i ].length() - 1) == words[ i + 1 ].charAt(0) ) {
                       System.out.println(words[ i ] + " " + words[ i + 1 ]);
                   }
               }
           }
       }catch (IOException e) {
                LOGGER.warn(e);
            }
            }
        }

