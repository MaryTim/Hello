package l08;

public class Square extends Quadrangle {

    public Square (double side) {
        sideA = side;
    }

    @Override
    public double calculateSquare() {
        double square = sideA * sideA;
        return square;
    }

    @Override
    public boolean isSquaresEqual(Shape shape) {
        double squareOfSquare = this.calculateSquare ( );
        double shapeSquare = shape.calculateSquare ( );
        if ( squareOfSquare == shapeSquare ) {
            System.out.println ("Плошадь фигур равна" );
            return true;
        } else {
            System.out.println ("Плошадь фигур не равна" );
            return false;
        }
    }

    @Override
    public String toString() {
        return "Square{" +
                "sideA=" + sideA +
                '}';
    }
}
