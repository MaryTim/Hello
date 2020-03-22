package l11;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Task1 {

    public static int countUnique (Integer [] a) {
        if (a.length == 0) {
            return 0;
        } else {
            Set<Integer> set = new HashSet<> (Arrays.asList(a)) {
            };
            return set.size();
        }
    }
    public static void main (String[] args) {
        Integer [] numbers = {3 , 12 , 3 , 77 , 4 , 4 , 88 , 90 , -5, -7 , -5};
        System.out.println("The quantity of unique numbers is " + countUnique(numbers));
    }


}
