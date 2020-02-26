package l03;

import java.util.Random;

public class Numbers10_99 {
    public static void main(String[] args) {
        int arr[] = new int[ 3 ];
        Random random = new Random ( );
        for (int i = 0; i < arr.length; i++) {
            arr[ i ] = random.nextInt ( 90 ) + 10;
            {
                System.out.println ( arr[ i ] );
            }
            if ( (arr[ 0 ] < arr[ 1 ]) && (arr[ 1 ] < arr[ 2 ]) ) {
                System.out.println ( "Массив со строго возврастающей последовательностью" );
            }
        }
    }
}
