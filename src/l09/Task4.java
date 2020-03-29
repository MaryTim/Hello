package l09;

public class Task4<T extends Number, V extends Number> {

    protected T a;
    protected V b;

    public Task4 (T a , V b) {
        this.a = a;
        this.b = b;
    }

    public int intSum () {
        return a.intValue() + b.intValue();
    }

    public double doubleSum () {
        return a.doubleValue() + b.doubleValue();
    }

    public int intMultiply () {
        return a.intValue() * b.intValue();
    }

    public double doubleMultiply () {
        return a.doubleValue() * b.doubleValue();
    }

    public int intMinus () {
        return a.intValue() - b.intValue();
    }

    public double doubleMinus () {
        return a.doubleValue() - b.doubleValue();
    }

    public int intDivision () {
        return a.intValue() / b.intValue();
    }

    public double doubleDivision () {
        return a.doubleValue() / b.doubleValue();
    }
}
