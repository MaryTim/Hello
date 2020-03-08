package l08;

public class ShapeUtils {

    public static boolean isRectangle (Shape shape) {
        if (shape instanceof Rectangle) {
            System.out.println ("This shape is rectangle" );
            return true;
        } else {
            System.out.println ( "This shape is not rectangle" );
            return false;
        }
    }

    public static boolean isTriangle (Shape shape) {
        if (shape instanceof Triangle) {
            System.out.println ("This shape is triangle" );
            return true;
        } else {
            System.out.println ( "This shape is not triangle" );
            return false;
        }
    }
}
