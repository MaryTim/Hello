package l08;

public class Rectangle extends Quadrangle {

    public Rectangle(double sideA , double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double calculateSquare() {
        double rectangleSquare = sideA * sideB;
        return rectangleSquare;
    }

    @Override
    public boolean isSquaresEqual(Shape shape) {
        double squareOfRectangle = this.calculateSquare ( );
        double shapeSquare = shape.calculateSquare ( );
        if ( squareOfRectangle == shapeSquare ) {
            System.out.println ("Плошадь фигур равна" );
            return true;
        } else {
            System.out.println ("Плошадь фигур не равна" );
            return false;
        }
    }

    public double countDiagonal () {
        double rectangleDiagonal = Math.sqrt ( Math.pow ( sideA, 2 ) * Math.pow ( sideB, 2 ));
        return rectangleDiagonal;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                '}';
    }
}
