package l12;

public class MyExceptionZero extends Exception{

    protected int number;

    public MyExceptionZero (int number) {
        this.number = number;
    }
}
