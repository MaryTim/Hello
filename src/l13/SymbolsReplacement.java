//Заменить все грустные смайлы
// :( в строке на весёлые

package l13;

public class SymbolsReplacement {

    public static void demonsrateReplacement () {

        String s = "Unfortunately I can't come tonight :( cos i'm sooo busy :( and next Monday i have classes :( See you on Tuesday :)";
        s = s.replace("(" , ")");
        System.out.println(s);
    }
}
