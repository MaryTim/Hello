package l09;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassAnalyzer {

    public static void analyzeFields (Class clazz) {
        Field[] fields = clazz.getDeclaredFields();
        if ( fields.length > 0 ) {
            System.out.println("Fields: ");
            for (Field field : fields) {
                System.out.println(field.getType() + " " + field.getName());
            }
            System.out.println();
        } 
    }

    public static void analyzeConstructors (Class clazz) {
        Constructor[] constructors = clazz.getDeclaredConstructors();
        if ( constructors.length > 0 ) {
            System.out.println("Constructors: ");
            for (Constructor constructor : constructors) {
                System.out.println(constructor + " " + constructor.getParameterCount() + " parameters");
            }
            System.out.println();
        }
    }

    public static void analyzeMethods (Class clazz) {
        Method[] methods = clazz.getDeclaredMethods();
        if ( methods.length > 0 ) {
            System.out.println("Methods: ");
            for (Method method : methods) {
                System.out.println(method.getName() + " " + method.getReturnType());
            }
            System.out.println();
        }
    }

    public static void main (String[] args) {
        ClassAnalyzer classAnalyzer = new ClassAnalyzer();
        classAnalyzer.analyze(Cat.class);
    }

    public void analyze (Class clazz) {
        System.out.println("The name of class is " + clazz.getSimpleName());
        System.out.println();
        analyzeFields(clazz);
        analyzeConstructors(clazz);
        analyzeMethods(clazz);
    }
}
