package l12;

import java.util.Random;

public class Task7 {

    public static void getException() throws Exception {
        Random random = new Random ( );
        if ( random.nextInt ( 2 ) == 0 ) {
            throw new Exception ( "bad luck" );
        }
    }
}
