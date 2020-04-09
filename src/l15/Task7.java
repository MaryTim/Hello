package l15;

import org.apache.log4j.Logger;

import java.io.*;

public class Task7 {

    private static final Logger LOGGER = Logger.getLogger(Task7.class);

    public static void main (String[] args) throws IOException {
        try (
                BufferedReader bf = new BufferedReader(new FileReader("src" + File.separator + "l15" + File.separator + "MyThread.java"));
                BufferedWriter bw = new BufferedWriter(new FileWriter("src" + File.separator + "l15" + File.separator + "ResultTask7"))) {
            String str = "";

            while((str = bf.readLine()) != null) {

                StringBuffer buffer = new StringBuffer(str);
                buffer.reverse();
                System.out.println(buffer);
                bw.write(String.valueOf(buffer) + "\n");
            }
        } catch (IOException ex) {
            LOGGER.warn(ex);
        }
    }
}
