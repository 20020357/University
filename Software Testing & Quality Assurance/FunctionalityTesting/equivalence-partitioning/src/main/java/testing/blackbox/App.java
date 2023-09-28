package testing.blackbox;

/**
 * Rectangle Area
 *
 */
public class App 
{
    public static long rectangleArea(int firstEdge, int secondEdge) {
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

    public static double rectangleArea(double firstEdge, String secondEdge) {
        throw new IllegalArgumentException("Input không hợp lệ!");
    }

    public static double rectangleArea(String firstEdge, double secondEdge) {
        throw new IllegalArgumentException("Input không hợp lệ!");
    }

    public static int rectangleArea(int firstEdge, String secondEdge) {
        throw new IllegalArgumentException("Input không hợp lệ!");
    }

    public static int rectangleArea(String firstEdge, int secondEdge) {
        throw new IllegalArgumentException("Input không hợp lệ!");
    }

    // public static double rectangleArea(char firstEdge, String secondEdge) {
    //     throw new IllegalArgumentException("Input không hợp lệ!");
    // }

    public static void main( String[] args )
    {
        System.out.println(rectangleArea(2, 3.2));
    }
}
