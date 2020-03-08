package l08;

public class Triangle implements Shape {

    double side;

    public Triangle (double side) {

        this.side = side;
    }

    public double calculateTriangleHeight () {
        double triangleHeight = Math.sqrt ( Math.pow ( side, 2 ) - Math.pow ( side, 2 )/4);
        return triangleHeight;
    }

    @Override
    public double calculateSquare () {
        double triangleSquare = (this.calculateTriangleHeight () * side)/2;
        return triangleSquare;
    }

    @Override
    public boolean isSquaresEqual(Shape shape) {
        double squareOfTriangle = this.calculateSquare ( );
        double shapeSquare = shape.calculateSquare ( );
        if ( squareOfTriangle == shapeSquare ) {
            System.out.println ("Плошадь фигур равна" );
            return true;
        } else {
            System.out.println ("Плошадь фигур не равна" );
            return false;
        }
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "side=" + side +
                '}';
    }
}
