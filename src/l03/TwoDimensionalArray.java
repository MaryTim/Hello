package l03;

import java.util.Scanner;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        System.out.println ( "Введите цифру от 0 до 2" );
        Scanner scan1 = new Scanner ( System.in );
        int i1 = scan1.nextInt ( );
        System.out.println ( "Введите цифру от 0 до 4" );
        Scanner scan2 = new Scanner ( System.in );
        int j1 = scan2.nextInt ( );
        System.out.println ( "Введите цифру от 0 до 2" );
        Scanner scan3 = new Scanner ( System.in );
        int i2 = scan3.nextInt ( );
        System.out.println ( "Введите цифру от 0 до 4" );
        Scanner scan4 = new Scanner ( System.in );
        int j2 = scan4.nextInt ( );
        int[][] arr1 = { { 1 , 6 , 3 , 9 , 3 } , { 4 , 7 , 2 , 9 , 0 } , { 7 , 4 , 9 , 0 , 4 } };
        int[][] arr2 = { { 6 , 9 , 5 , 6 , 2 } , { 6 , 7 , 8 , 9 , 2 } , { 2 , 9 , 9 , 2 , 6 } };
        if ( arr1[ i1 ][ j1 ] == arr2[ i2 ][ j2 ] ) {
            System.out.println ( "Выбранные элементы равны " + arr1[ i1 ][ j1 ] + " = " + arr2[ i2 ][ j2 ] );
        } else {
            System.out.println ( "Выбранные элементы не равны" );
        }
        boolean res = equals ( arr1 , arr2 , 2 , 2 );
    }
    private static boolean equals(int[][] arr1 , int[][] arr2 , int i , int j) {
        return arr1[ i ][ j ] == arr2[ i ][ j ];
    }
}
