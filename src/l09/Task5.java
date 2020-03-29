package l09;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class Task5 {

    public static void analyzeTransaction (Class clazz) {
        for (Method method : clazz.getMethods()) {
            for (Annotation annotation : method.getAnnotations()) {
                if ( annotation instanceof Transaction ) {
                    System.out.println("Transaction is started !");
                    try {
                        Cat cat = new Cat(2 , "black" , "Zoe");
                        method.invoke(cat);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    System.out.println("Transaction is ended !");
                }
            }
        }
    }
}
