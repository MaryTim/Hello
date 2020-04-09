package l20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class Task2 {

    protected static int[] array = new int[ 1000000 ];

    public static void main (String[] args) throws ExecutionException, InterruptedException {
        for (int i = 0; i < array.length; i++) {
            array[ i ] = (int) (Math.random() * 301);
        }
        getTime1Thread(array);
        getTime10Threads(array);
    }

    public static long getTime1Thread (int[] array) {
        long start = System.currentTimeMillis();
        ExecutorService service = Executors.newSingleThreadExecutor();
        service.submit(() -> {
            int max = 0;
            for (int number : array) {
                if ( number > max ) {
                    max = number;
                }
            }
            System.out.println("The largest number is " + max);
        });
        service.shutdown();
        long finish = System.currentTimeMillis();
        System.out.println("single thread: " + (finish - start));
        return finish - start;
    }

    public static long getTime10Threads (int[] array) throws ExecutionException, InterruptedException {
        long start = System.currentTimeMillis();
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        List<Future<Integer>> list = new ArrayList<>(10);
        int del = 10;
        int block = 100000;
        int border1 = 0;
        while (del > 0) {
            del--;
            int border2 = array.length - block * del;
            int [] blockOfArray = Arrays.copyOfRange(array,border1, border2);
            border1 = border2;
            list.add(executorService.submit(() -> Arrays.stream(blockOfArray).max().getAsInt()));
        }

        int max = 0;
        for (Future<Integer> l : list) {
            if ( l.get() > max ) {
                max = l.get();
            }
        }
        executorService.shutdown();
        long finish = System.currentTimeMillis();
        System.out.println("The largest number is " + max);
        System.out.println("10 threads: " + (finish - start));
        return finish - start;
    }
}


