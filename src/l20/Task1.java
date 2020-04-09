package l20;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Task1 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sleepTime = 0;
        ExecutorService service = Executors.newSingleThreadExecutor();
        while(sleepTime != -1) {
            sleepTime = scanner.nextInt();
            int sleepTime1 = sleepTime;
            service.submit(new Runnable() {
                @Override
                public void run () {
                    try {
                        Thread.sleep(sleepTime1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("I sleep " + sleepTime1 + " seconds");
                }
            });
        }
        System.out.println("The process is finished");
        service.shutdown();
    }
}
