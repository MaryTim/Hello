package l11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class L10Task7 {

    public static void main (String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(-7);
        numbers.add(15);
        numbers.add(-100);
        numbers.add(99);
        numbers.add(23489);
        numbers.add(-2304);
        numbers.add(-2);

        Collections.sort(numbers);
        Collections.reverse(numbers);
        System.out.println(numbers);
    }
}
