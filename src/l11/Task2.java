package l11;

import java.util.*;

public class Task2 {

    public static boolean isUnique (Collection<String> a) {
        Set<String> set = new LinkedHashSet<>(a);
        if (a.size() == set.size())
        return true;
        else  return false;
    }

    public static void main (String[] args) {
        Map<String, String> names = new LinkedHashMap<>();
        names.put("Kendrick", "kjb");
        names.put("Stuart", "Reges");
        names.put("Jessica", "Miller");
        names.put("Bruce", "Reges");
        names.put("Hal", "Perkins");
        Collection<String> coll = names.values();
        System.out.println("All the values are unique. " + isUnique(coll));
    }
}
