package l11;

import java.util.*;

public class Task4 {

    static List<Integer> numbers = List.of(3 , -5 , 10 , -65 , 12 , 77 , -3 , -5 , 12 , 8);

    public static Integer minK (int i) {
        Set<Integer> numbersSet = new HashSet<>();
        numbersSet.addAll(numbers);

        ArrayList<Integer> sortedNumbers = new ArrayList<>(numbersSet);
        Collections.sort(sortedNumbers);

        return sortedNumbers.get(i - 1);
    }

    public static Integer maxN (int i) {
        Set<Integer> numbersSet = new HashSet<>();
        numbersSet.addAll(numbers);

        ArrayList<Integer> sortedNumbers = new ArrayList<>(numbersSet);
        Collections.sort(sortedNumbers);
        Collections.reverse(sortedNumbers);

        return sortedNumbers.get(i - 1);
    }

    public static void main (String[] args) {
        System.out.println(numbers);

        System.out.println(maxN(2));
        System.out.println(minK(3));
    }
}
