public class Circle extends Shape {
  protected double radius;
  protected Point center;

  /**Initialize default Circle. */
  public Circle() {}

  /**Initialize Circle with radius. */
  public Circle(double radius) {
    this.radius = radius;
  }

  /**Initialize Circle with radius, color and filled. */
  public Circle(double radius, String color, boolean filled) {
    super(color, filled);
    this.radius = radius;
  }

  /**Initialize Circle with center, radius, color and filled.*/
  public Circle(Point center, double radius, String color, boolean filled) {
    super(color, filled);
    this.center = center;
    this.radius = radius;
  }

  /**Getter center. */
  public Point getCenter() {
    return this.center;
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
  @Override
  public double getArea() {
    return Math.PI * radius * radius;
  }

  /**Getter perimeter. */
  @Override
  public double getPerimeter() {
    return 2 * Math.PI * radius;
  }

  /**Override method equals. */
  @Override
  public boolean equals(Object obj) {
    Circle other = (Circle) obj;
    if (radius == other.radius && center.equals(other.center)) {
      return true;
    }
    return false;
  }

  /**OVer ride function toString. */
  @Override
  public String toString() {
    return "Circle[center=(" + String.format("%.1f", center.getPointX()) + ","
            + String.format("%.1f", center.getPointY()) + ")"
            + ",radius=" + radius + ",color=" + getColor() + ",filled=" + isFilled() + "]";
  }
}
