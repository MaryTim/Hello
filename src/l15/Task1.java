package l15;

import org.apache.log4j.Logger;

import java.io.*;

public class Task1 {

    private static final Logger LOGGER = Logger.getLogger(Task1.class);

    public static void main (String[] args) throws IOException {
        File myFile = new File("src" + File.separator + "l15" + File.separator + "Example");
        if ( myFile.exists() ) {
            try (BufferedReader in = new BufferedReader(new FileReader(myFile))) {
                String str = "";
                while((str = in.readLine()) != null) {
                    System.out.println(str);
                }

            } catch (IOException ex) {
                LOGGER.warn(ex);
            }
        }
    }
}

