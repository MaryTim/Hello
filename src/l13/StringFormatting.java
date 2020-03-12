package l13;

import java.util.Formatter;

public class StringFormatting {

    public static void formateString () {

        long w = 12345678957765l;
        String w1 = "0000000000";
        String newW = "" + w;
        Formatter fmt = new Formatter();

        if ( newW.length() <= 10 ) {
            fmt.format("%010d" , w);
            System.out.println(fmt);
        } else {
            System.out.println(w1);
        }
    }
}

