package l12;

import java.util.Random;

public class Task6 {

    public static void getRandomException() throws Exception {

        Exception ex [] = new Exception [3];
        ex[0] = new ArrayIndexOutOfBoundsException ( "arrayIndexOutOfBoundsException" );
        ex[1] = new NullPointerException ( "NullPointerException" );
        ex[2] = new ArithmeticException ( "ArithmeticException" );

        Random rand = new Random ();
        throw ex[rand.nextInt(3)];

        }

    }
