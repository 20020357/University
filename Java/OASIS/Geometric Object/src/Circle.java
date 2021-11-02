public class Circle implements GeometricObject {
  public static final double PI = 3.14;
  private Point center;
  private double radius;

  /**Initialize Circle default. */
  public Circle(Point center, double radius) {
    this.center = center;
    this.radius = radius;
  }

  /**Getter center. */
  public Point getCenter() {
    return center;
  }

  /**Setter center. */
  public void setCenter(Point center) {
    this.center = center;
  }

  /**Getter radius. */
  public double getRadius() {
    return radius;
  }

  /**Setter radius. */
  public void setRadius(double radius) {
    this.radius = radius;
  }

  /**Getter area. */
  public double getArea() {
    return PI * radius * radius;
  }

  /**Getter perimeter. */
  public double getPerimeter() {
    return 2 * PI * radius;
  }

  /**Getter info. */
  public String getInfo() {
    return "Circle[(" + String.format("%.2f", center.getPointX()) + ","
      + String.format("%.2f", center.getPointY()) + "),r=" + String.format("%.2f", radius) + "]";
  }
}
