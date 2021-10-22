public class Main {
  /**Main. */
  public static void main(String[] args) {
    Layer layer = new Layer();
    
    Point center = new Point(10, 5);
    layer.addShape(new Circle(center, 8, "red", true));

    Point topLeft1 = new Point(10, 5);
    layer.addShape(new Rectangle(topLeft1, 8, 6, "red", true));

    layer.addShape(new Circle(center, 8, "red", true));

    Point topLeft2 = new Point(10.5, 5);
    layer.addShape(new Rectangle(topLeft2, 8, 6, "blue", true));

    layer.addShape(new Square(topLeft1, 8, "red", true));
    layer.addShape(new Rectangle(topLeft2, 8, 6, "red", true));
    
    System.out.println(layer.getInfo());

    layer.removeDuplicates();
    System.out.println(layer.getInfo());

    // layer.removeCircles();
    // System.out.println(layer.getInfo());
  }
}
