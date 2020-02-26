package l03;

public class FactorialWhile {
    public static void main(String[] args) {
        int i = 1;
        int f = 1;
        while (i <= 10) {
            f = f * i;
            i++;
            {
                System.out.println ( f );
            }
        }
    }

}
