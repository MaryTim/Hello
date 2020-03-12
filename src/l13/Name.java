// Написать функцию, принимающую в качестве параметров имя, фамилию и
//отчество и возвращающую инициалы
//в формате "Ф.И.О". Учесть, что входные параметры могут быть в любом
//регистре, а результирующая строка должна быть в верхнем

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
