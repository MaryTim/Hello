package l13;

public class Addition {

    public static void demonstrateSimpleAddition () {

        String str1 = "Hello!";
        str1 += " How are you?";
        str1 += " How's the weather?";
        System.out.println(str1);
    }

    public static void demonstrateStringBuilder () {

        StringBuilder sb = new StringBuilder("Hello!");
        sb.append(" How are you? How's the weather?");
        System.out.println(sb);
    }
}
