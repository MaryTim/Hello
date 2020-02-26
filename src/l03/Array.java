package l03;

import java.util.Random;

public class Array {
    public static void main(String[] args) {
        int arr[] = new int[ 8 ];
        Random rand = new Random ( );
        for (int i = 0; i < arr.length; i++) {
            arr[ i ] = rand.nextInt ( 30 );
            System.out.println ( "Initial array: " + arr[ i ] );
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println ( "New array: " + arr[ i ] );
        }
    }
}

