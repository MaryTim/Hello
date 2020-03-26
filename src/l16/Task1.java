package l16;

import org.apache.log4j.Logger;

import java.io.*;

public class Task1 {

    private static final Logger LOGGER = Logger.getLogger(Task1.class);

    public static void main (String[] args) throws IOException {
        long start = System.currentTimeMillis();
        int s = 0;
        BufferedReader br = new BufferedReader(new FileReader("/Users/antonbudkevich/Desktop/MASHA/IDEA/5mb.txt"));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("/Users/antonbudkevich/Desktop/MASHA/IDEA/5mbBWWriter.txt")));
        while ((s = br.read()) != -1) {
            bw.write((char) s);
        }
        br.close();
        bw.close();
        long finish = System.currentTimeMillis();
        System.out.println("BufferedReader/Writer: " + (finish - start) + " ms");
        long start2 = System.currentTimeMillis();
        int b = 0;
        Reader br2 = new FileReader("/Users/antonbudkevich/Desktop/MASHA/IDEA/5mb.txt");
        Writer bw2 = new FileWriter("/Users/antonbudkevich/Desktop/MASHA/IDEA/5mbWriter.txt");
        while ((b = br2.read()) != -1) {
            bw2.write((char) b);
        }
        br2.close();
        bw2.close();
        long finish2 = System.currentTimeMillis();
        System.out.println("Reader/Writer: " + (finish2 - start2) + " ms");

        if ((finish-start) < (finish2-start2))
            System.out.println("BufferedReader/Writer is faster " + "\n" + "The difference is " + ((finish2-start2) - (finish-start)) + " ms");
        else System.out.println("Reader/Writer is faster " + "\n" + "The difference is " + ((finish-start) - (finish2-start2)) + " ms");
    }
    }
