package l12;

public class MyExceptionRuntime extends RuntimeException {

    public MyExceptionRuntime (String message) {
        super(message);
    }

    public static void method () {
        throw new MyExceptionRuntime ( "This is my runtime exception" );
    }

}
