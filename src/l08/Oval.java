package l08;

public class Oval extends Ellipse {

    public Oval(double minorAxis , double majorAxis) {
        this.semiMajorAxis = majorAxis;
        this.semiMinorAxis = minorAxis;
    }

    @Override
    public double calculateSquare() {
        double ovalSquare = semiMajorAxis * semiMinorAxis * PI;
        return ovalSquare;
    }

    @Override
    public boolean isSquaresEqual(Shape shape) {
        double squareOfOval = this.calculateSquare ( );
        double shapeSquare = shape.calculateSquare ( );
        if ( squareOfOval == shapeSquare ) {
            System.out.println ("Плошадь фигур равна" );
            return true;
        } else {
            System.out.println ("Плошадь фигур не равна" );
            return false;
        }
    }

    @Override
    public String toString() {
        return "Oval{" +
                "PI=" + PI +
                ", semiMinorAxis=" + semiMinorAxis +
                ", semiMajorAxis=" + semiMajorAxis +
                '}';
    }
}
