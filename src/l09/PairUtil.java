package l09;

public final class PairUtil {

    public static <K, V> Pair<V, K> swap (Pair <K, V> pair) {
        Pair <V, K> pair1= new Pair<> (pair.getValue(), pair.getKey());
        return pair1;
    }
}
