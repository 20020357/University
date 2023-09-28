package testing.blackbox;

/**
 * Rectangle Area
 *
 */
public class App 
{
    public static int rectangleArea(int firstEdge, int secondEdge) {
        if (firstEdge <= 0 || secondEdge <= 0) {
            throw new IllegalArgumentException("Input không hợp lệ!");
        }
        return firstEdge * secondEdge;
    }

    public static double rectangleArea(double firstEdge, double secondEdge) {
        if (firstEdge <= 0 || secondEdge <= 0) {
            throw new IllegalArgumentException("Input không hợp lệ!");
        }
        return firstEdge * secondEdge;
    }

    public static double rectangleArea(double firstEdge, int secondEdge) {
        if (firstEdge <= 0 || secondEdge <= 0) {
            throw new IllegalArgumentException("Input không hợp lệ!");
        }
        return firstEdge * secondEdge;
    }

    public static double rectangleArea(int firstEdge, double secondEdge) {
        if (firstEdge <= 0 || secondEdge <= 0) {
            throw new IllegalArgumentException("Input không hợp lệ!");
        }
        return firstEdge * secondEdge;
    }

    public static void main( String[] args )
    {
        System.out.println(rectangleArea(2, 3.2));
    }
}
