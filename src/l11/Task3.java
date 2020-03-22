package l11;

import java.util.*;

public class Task3 {

    public static void main (String[] args) {
        Map<Integer, Integer> first = new HashMap<>();
        first.put(3 , -5);
        first.put(2 , -1);
        first.put(0 , 10);

        Map<Integer, Integer> second = new HashMap<>();
        second.put(2 , 3);
        second.put(1 , 3);

        Map<Integer, Integer> result = new HashMap<>();

        for (int key : first.keySet()) {
            if ( second.containsKey(key) ) {
                int valueForKey = first.get(key) + second.get(key);
                result.put(key , valueForKey);
            } else {
                result.put(key , first.get(key));
            }
        }

        for (int key : second.keySet()) {
            if ( !result.containsKey(key) ) {
                result.put(key , second.get(key));
            }
        }

        Set<Integer> keys = new TreeSet<>(result.keySet());
        int i = 0;
        for (int key : keys) {
            if ( i == 0 ) {
                if ( key == 0 ) {
                    System.out.print(result.get(key));
                } else {
                    System.out.print(result.get(key) + "xˆ" + key);
                }
            } else {
                if ( key == 0 ) {
                    System.out.print(result.get(key));
                } else {
                    if ( result.get(key) < 0 ) {
                        System.out.print(" - " + (result.get(key) * -1) + "xˆ" + key);
                    } else {
                        System.out.print(" + " + result.get(key) + "xˆ" + key);
                    }
                }
            }
            i++;
        }
    }
}
