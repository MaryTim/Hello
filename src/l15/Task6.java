package l15;

import java.io.File;

public class Task6 {

    public static void main (String[] args) {
        File dir = new File("/Users/antonbudkevich/Desktop/MASHA");
        getFiles(dir);
    }

    public static void getFiles (File dir) {
        if ( dir.exists() && dir.isDirectory() ) {
            for (File fs : dir.listFiles()) {
                System.out.println(fs.getAbsolutePath());
                getFiles(fs.getAbsoluteFile());
            }
        }
    }
}