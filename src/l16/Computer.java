package l16;

import org.apache.log4j.Logger;

import java.io.*;

public class Computer implements Serializable {

    private static final Logger LOGGER = Logger.getLogger(Computer.class);

    protected String name;
    protected String number;
    protected int year;

    public Computer (String nn, String n, int y) {
        this.name = nn;
        this.number = n;
        this.year = y;
    }

    public static void main (String[] args) throws IOException, ClassNotFoundException {

        Computer computer = new Computer("MacBook Pro" , "FVFWF112HV27" , 2017);
        try {
            FileOutputStream fos = new FileOutputStream("/Users/antonbudkevich/Desktop/MASHA/IDEA/Serialization.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(computer);
            oos.close();
        } catch (IOException e) {
            LOGGER.warn(e);
        }

        try {
            FileInputStream fis = new FileInputStream("/Users/antonbudkevich/Desktop/MASHA/IDEA/Serialization.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Object newComputer = ois.readObject();
            Computer computer1 = (Computer) newComputer;
            System.out.println(computer1.name);
            System.out.println(computer1.number);
            System.out.println(computer1.year);
            ois.close();
        } catch (IOException e) {
            LOGGER.warn(e);
        }
    }

}
