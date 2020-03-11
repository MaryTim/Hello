package l12;

import java.util.logging.Logger;


public class Exceptions {

    private static final Logger LOGGER = Logger.getLogger ( "Exceptions" );

    public static void main(String[] args) {

//1
        Integer s = null;
        try {
            s.byteValue ( );
        } catch (NullPointerException ex) {
            LOGGER.warning ( "It's impossible to implement the method cos s = null" );
        }


//2
        int[] array = new int[ 5 ];
        try {
            System.out.println ( array[ 5 ] );
        } catch (ArrayIndexOutOfBoundsException a) {
            LOGGER.warning ( a.getMessage ( ) );
        }


//3
        try {
            MyException.show ( 0 );
        } catch (MyExceptionZero e) {
            LOGGER.warning ( "Invalid number" );
            e.printStackTrace ( );
        }


//4
        try {
            MyExceptionRuntime.method ( );
        } catch (MyExceptionRuntime e) {
            e.printStackTrace ( );
            LOGGER.warning ( "This is my runtime exception" );
        }


//5
        int b = 5;
        try {
            System.out.println ( b / 0 );
//            MyExceptionIncorrectNumber.createMethod ();
        } catch (ArithmeticException e) {
            try {
                throw new MyExceptionIncorrectNumber ( e );
            } catch (MyExceptionIncorrectNumber x) {
                LOGGER.warning ( x.getMessage ( ) );
            }

        }


//6
        try {
            Task6.getRandomException ( );
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException | NullPointerException e) {
            LOGGER.warning ( e.getMessage () );
        } catch (Exception e) {
            LOGGER.warning ( "Unknown exception " + e.getMessage () );
        }



//7
        try {
            Task7.getException ();
        } catch (Exception e ) {
            LOGGER.warning ( "This is exception " + e.getMessage () );
        }

    }
}



