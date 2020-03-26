//Написать два цикла, выполняющих многократное сложение строк, один с помощью оператора сложения и String,
//второй с помощью StringBuilder и метода append. Сравнить скорость их выполнения

package l13;

import java.time.Duration;
import java.time.LocalTime;

public class Addition {

    public static void demonstrateSimpleAddition () {

        String str1 = "Hello!";
        LocalTime t1 = LocalTime.now();
        str1 += " How are you?";
        str1 += " How's the weather?";
        System.out.println(str1);
        LocalTime t2 = LocalTime.now();
        Duration between = Duration.between(t2, t1);
        long duration = between.getNano();
        System.out.println(duration);
    }

    public static void demonstrateStringBuilder () {

        StringBuilder sb = new StringBuilder("Hello!");
        LocalTime t1 = LocalTime.now();
        sb.append(" How are you? How's the weather?");
        System.out.println(sb);
        LocalTime t2 = LocalTime.now();
        Duration between = Duration.between(t2, t1);
        long duration = between.getNano();
        System.out.println(duration);
    }
}
