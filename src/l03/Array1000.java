package l03;

import java.util.Random;

public class Array1000 {
    public static void main(String[] args) {
        double array[] = new double[1000];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextDouble() * 20;
            System.out.print(array[i]);
        }
        for (int i = 0; i < array.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] > array[minIndex]) {
                    minIndex = j;
                }
            }
            double temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("Максимальное значение " + array[0]);
        System.out.println("Минимальное значение " + array[array.length - 1]);
        System.out.println("Среднее значение " + ((array[array.length - 1] + array[0]) / 2));
    }
}
