package l08;

public class Circle extends Ellipse {

    public Circle(double r) {
        this.radius = r;
    }

    @Override
    public double calculateSquare() {
        double circleSquare = PI * Math.pow ( radius , 2.0 );
        return circleSquare;
    }

    @Override
    public boolean isSquaresEqual(Shape shape) {
        double squareOfCircle = this.calculateSquare ( );
        double shapeSquare = shape.calculateSquare ( );
        if ( squareOfCircle == shapeSquare ) {
            System.out.println ("Плошадь фигур равна" );
            return true;
        } else {
            System.out.println ("Плошадь фигур не равна" );
            return false;
        }
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", PI=" + PI +
                '}';
    }
}
