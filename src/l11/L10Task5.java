package l11;

import java.util.*;

public class L10Task5 {
    public static void main (String[] args) {
        List<Integer> list1 = List.of(2, 3, 4, 5, 6, 7);
        List<Integer> list2 = List.of(1, 3, 7, 9, 0);
        System.out.println("Unification: " + unification(list1,list2));
        System.out.println("Intersection: " + intersection(list1,list2));
    }

    public static Set<Integer> unification (List<Integer> a, List<Integer> b) {
        Set<Integer> set = new TreeSet<>(a);
        set.addAll(b);
        return set;
    }

    public static Set<Integer> intersection (List<Integer> a, List<Integer> b) {
        Set<Integer> set = new TreeSet<>(a);
        set.retainAll(b);
        return set;
    }
}
