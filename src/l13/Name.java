package l13;

public class Name {

    public static void getInitials () {
        String surname = "timoshenko";
        String name = "maria";
        String patronymic = "sergeevna";

        char s = surname.charAt(0);
        char n = name.charAt(0);
        char p = patronymic.charAt(0);

        String s1 = "" + s;
        String n1 = "" + n;
        String p1 = "" + p;

        System.out.println(s1.toUpperCase() + "." + n1.toUpperCase() + "." + p1.toUpperCase());
    }
}
