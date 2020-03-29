package l09;

public class Demo <T> {
    public static void main (String[] args) {
        Pair<Integer, String> pair = new Pair<>(45, "hi!");
        pair.demonstrateObjectInfo();

        PairUtil.swap(pair).demonstrateObjectInfo();

        Task4<Integer, Double> q = new Task4<>(5, 3.3 );
        System.out.println(q.intSum( ));
        System.out.println(q.doubleSum());
        System.out.println(q.intMultiply());
        System.out.println(q.doubleMultiply());
        System.out.println(q.intMinus());
        System.out.println(q.doubleMinus());
        System.out.println(q.intDivision());
        System.out.println(q.doubleDivision());

    }

}
