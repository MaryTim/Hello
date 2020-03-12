//Написать два цикла, выполняющих многократное сложение строк, один с помощью оператора сложения и String,
//второй с помощью StringBuilder и метода append. Сравнить скорость их выполнения

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
