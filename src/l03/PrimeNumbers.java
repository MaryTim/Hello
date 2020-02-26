package l03;

import java.util.Random;

public class PrimeNumbers {
    public static void main(String[] args) {
        Random random = new Random ( );
        int n = random.nextInt ( 1000 );
        for (int i = 2; i < n; i++) {
            if ( n % i == 0 ) {
                System.out.println ( n + " не является простым" );
                return;
            }
        }
        System.out.println ( n + " является простым" );
    }
}

