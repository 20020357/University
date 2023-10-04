package testing.whitebox;

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

    public static void main( String[] args )
    {
        System.out.println( rectangleArea(-1, 5) );
    }
}
