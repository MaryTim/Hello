package l08;

public class ShapeDemo {
    public static void main(String[] args) {
        Shape square = new Square ( 2.0 );
        System.out.println ( "Площадь квадрата " + square.calculateSquare ());

        Shape rectangle = new Rectangle ( 2.0, 2.0 );
        System.out.println ("Площадь прямоугольника " + rectangle.calculateSquare () );
        System.out.println ( square.isSquaresEqual (rectangle ));

        Shape circle = new Circle ( 4.2 );
        System.out.println ( "Площадь круга " + circle.calculateSquare ());
        System.out.println ( circle.isSquaresEqual (square));

        Shape oval = new Oval ( 2.5, 3.0 );
        System.out.println ( "Площадь овала " + oval.calculateSquare ());
        System.out.println ( oval.isSquaresEqual (circle));

        Shape triangle = new Triangle ( 3.0);
        System.out.println ( "Площадь треугольника " + triangle.calculateSquare ());
        System.out.println ( triangle.isSquaresEqual (oval));

        System.out.println (ShapeUtils.isTriangle ( triangle ) );
        System.out.println (ShapeUtils.isRectangle ( circle ) );
        System.out.println (ShapeUtils.isRectangle ( rectangle ) );

        System.out.println (triangle.toString () );
        System.out.println (rectangle.toString () );
        System.out.println (circle.toString () );
        System.out.println (oval.toString () );
        System.out.println (square.toString () );
    }
}
