package l13;

public class DuplicatesReplacement {

    public static void replaceDuplicates () {

        String q = "bhhhhvfxggljjjj";

        StringBuilder newQ = new StringBuilder(q);
        for (int i = 0; i < newQ.length() - 1; i++) {
            if ( newQ.charAt(i) == newQ.charAt(i + 1) ) {
                newQ.deleteCharAt(i + 1);
                i--;
            }
        }

        q = newQ.toString();
        System.out.println(q);
    }
}
