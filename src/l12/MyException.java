package l12;

public class MyException {

    public static void show (int number) throws MyExceptionZero {
        if (number == 0) {
            throw new MyExceptionZero ( 0 );
        }
    }
}
