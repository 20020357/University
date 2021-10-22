import java.util.ArrayList;
import java.util.List;

public class Layer {
  private List<Shape> shapes = new ArrayList<Shape>();
  
  /**Add shape. */
  public void addShape(Shape shape) {
    shapes.add(shape);
  }

  /**Get info. */
  public String getInfo() {
    String result = "Layer of crazy shapes:\n";
    for (int i = 0; i < shapes.size(); i++) {
      if (shapes.get(i) instanceof Circle) {
        Circle temp = (Circle) shapes.get(i);
        result += temp.toString() + "\n";
      }
      
      if (shapes.get(i) instanceof Rectangle) {
        Rectangle temp = (Rectangle) shapes.get(i);
        result += temp.toString() + "\n";
      }
    }
    return result;
  }

  /**Remove Circle. */
  public void removeCircles() {
    for (int i = 0; i < shapes.size(); i++) {
      if (shapes.get(i) instanceof Circle) {
        shapes.remove(i);
      }
    }
  }

  /**Remove duplicate shapes. */
  public void removeDuplicates() {
    for (int i = 0; i < shapes.size(); i++) {
      for (int j = i + 1; j < shapes.size(); j++) {
        if (shapes.get(i) instanceof Circle && shapes.get(j) instanceof Circle) {
          Circle circle1 = (Circle) shapes.get(i);
          Circle circle2 = (Circle) shapes.get(j);
          if (circle1.equals(circle2)) {
            shapes.remove(j);
          }
        }

        if (shapes.get(i) instanceof Rectangle && shapes.get(j) instanceof Rectangle) {
          Rectangle rectangle1 = (Rectangle) shapes.get(i);
          Rectangle rectangle2 = (Rectangle) shapes.get(j);
          if (rectangle1.equals(rectangle2)) {
            shapes.remove(j);
          }
        } else if (shapes.get(i) instanceof Square && shapes.get(j) instanceof Square) {
          Square square1 = (Square) shapes.get(i);
          Square square2 = (Square) shapes.get(j);
          if (square1.equals(square2)) {
            shapes.remove(j);
          }
        }
      }
    }
  }
}
