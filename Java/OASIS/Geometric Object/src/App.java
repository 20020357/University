import java.util.ArrayList;
import java.util.List;

public class App {
  /**Main method. */
  public static void main(String[] args) {
    List<GeometricObject> shapes = new ArrayList<GeometricObject>();

    try {
      GeometricObject triangle1 = new Triangle(new Point(1,2), new Point(2,1), new Point(3,0));
      shapes.add(triangle1);
      System.out.println(triangle1.getArea());
    } catch (Exception e) {
      e.printStackTrace();
    }
    try {
      GeometricObject triangle2 = new Triangle(new Point(-1,-3), new Point(-5,3), new Point(0,0));
      shapes.add(triangle2);
      System.out.println(triangle2.getPerimeter());
    } catch (Exception e) {
      e.printStackTrace();
    }
    GeometricObject circle1 = new Circle(new Point(1,2), 3);
    GeometricObject circle2 = new Circle(new Point(5,6), 2);
    shapes.add(circle1);
    shapes.add(circle2);
    ShapeUtil shapeUtil = new ShapeUtil();
    System.out.println(shapeUtil.printInfo(shapes));
    
    System.out.println(circle1.getArea());
    System.out.println(circle2.getPerimeter());
  }
}
