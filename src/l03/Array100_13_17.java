package l03;

public class Array100_13_17 {

    public static void main(String[] args) {
        int[] array = new int[ 100 ];
        int n = 0;
        int a = 0;
        while (a < array.length) {
            n++;
            if ( (n % 13 == 0) || (n % 17 == 0) ) {
                array[ a ] = n;
                a++;
            }
        }
        for (a = 0; a < array.length; a++) {
            System.out.println ( array[ a ] );

        }
    }
}
