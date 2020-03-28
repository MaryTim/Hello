package l15;

import org.apache.log4j.Logger;

import java.io.*;
import java.util.Random;

public class Task5 {

    private static final Logger LOGGER = Logger.getLogger(Task5.class);

    public static void main (String[] args) throws IOException {
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("src" + File.separator +
                "l15" + File.separator + "256"));
             DataInputStream dis = new DataInputStream(new FileInputStream("src" + File.separator +
                     "l15" + File.separator + "256"))) {
            Random random = new Random();
            int i;
            int min = 256;
            int max = 500;
            int diff = max - min;
            for (i = 0; i < 20; i++) {
                int number = random.nextInt(diff + 1);
                number += min;
                System.out.print(number + " ");
                dos.write((number >>> 24) & 0xFF);
                dos.write((number >>> 16) & 0xFF);
                dos.write((number >>> 8) & 0xFF);
                dos.write((number >>> 0) & 0xFF);
            }
            System.out.println();
            int sum = 0;
            for (int a = 0; a < 20; a++) {
                int n = dis.readInt();
                System.out.print(n + " ");
                sum += n;
            }
            System.out.println();
            System.out.println("Arithmetical mean is " + sum / 20);
        } catch (IOException e) {
            LOGGER.warn(e);
        }

    }
}





