package l15;

import org.apache.log4j.Logger;


import java.io.File;
import java.util.Arrays;

public class Task6 {

    private static final Logger LOGGER = Logger.getLogger(Task6.class);

    public static void main(String[] args) {
        File dir = new File("/Users/antonbudkevich/Desktop/Data Analysis");
        if (dir.exists() && dir.isDirectory()) {
            File[] files = dir.listFiles();

                for (File f : files) {
                    System.out.println( "\n" + Arrays.toString(recursion(f)));
                }
            }
        }

    public static File[] recursion(File f){
        File[] files = f.listFiles();
        if (files != null) {
            for (File file: files) {
                if (file.isDirectory()) {
                    return recursion(file);
                }
            }
        }
        return f.listFiles();
    }
}
