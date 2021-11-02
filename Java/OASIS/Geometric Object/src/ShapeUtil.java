import java.util.List;

public class ShapeUtil {
  /**Print Info. */
  public String printInfo(List<GeometricObject> shapes) {
    String circle = "Circle:\n";
    String triangle = "Triangle:\n";
    for (int i = 0; i < shapes.size(); i++) {
      if (shapes.get(i) instanceof Circle) {
        Circle temp = (Circle) shapes.get(i);
        circle += temp.getInfo() + "\n";
      } else {
        Triangle temp = (Triangle) shapes.get(i);
        triangle += temp.getInfo() + "\n";
      }
    }
    return circle + triangle;
  }
}
