package l16;

import org.apache.log4j.Logger;

import java.io.*;

public class Notebook extends Computer implements Serializable {

    private static final Logger LOGGER = Logger.getLogger(Notebook.class);

    private Touchpad touchpad;
    private transient String color;

    public Notebook (String nn , String n , int y, Touchpad t, String c) {
        super(nn , n , y);
        this.touchpad = t;
        this.color = c;
    }

    public static void main (String[] args) throws IOException, ClassNotFoundException {

        Touchpad touchpad = new Touchpad(true);
        Notebook notebook = new Notebook("MacBook Pro" , "FVFWF112HV27" , 2017 , touchpad , "silver");

        try {
            FileOutputStream fos = new FileOutputStream("/Users/antonbudkevich/Desktop/MASHA/IDEA/Serialization.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(notebook);
            oos.close();
        } catch (IOException e) {
            LOGGER.warn(e);
        }
        try {
            FileInputStream fis = new FileInputStream("/Users/antonbudkevich/Desktop/MASHA/IDEA/Serialization.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Object newNotebook = ois.readObject();
            Notebook notebook1 = (Notebook)newNotebook;
            System.out.println(notebook1.name);
            System.out.println(notebook1.number);
            System.out.println(notebook1.year);
            System.out.println(notebook1.touchpad.hasTouchpad);
            System.out.println(notebook1.color);
            ois.close();
        } catch (IOException e) {
            LOGGER.warn(e);
        }
    }

}
