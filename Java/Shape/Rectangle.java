public class Rectangle extends Shape {
  protected double width;
  protected double length;
  protected Point topLeft;
  
  /**Initialize default Rectangle. */
  public Rectangle() {}

  /**Initialize Rectangle with width and length. */
  public Rectangle(double width, double length) {
    this.width = width;
    this.length = length;
  }

  /**Initialize Rectangle with width, length, color and filled. */
  public Rectangle(double width, double length, String color, boolean filled) {
    super(color, filled);
    this.width = width;
    this.length = length;
  }

  /**Initialize Rectangle with width, length, color and filled. */
  public Rectangle(Point topleft, double width, double length, String color, boolean filled) {
    super(color, filled);
    this.width = width;
    this.length = length;
    this.topLeft = topleft;
  }

  /**Getter width. */
  public double getWidth() {
    return width;
  }

  /**Setter width. */
  public void setWidth(double width) {
    this.width = width;
  }
  
  /**Getter length. */
  public double getLength() {
    return length;
  }

  /**Setter length. */
  public void setLength(double length) {
    this.length = length;
  }

  /**Getter topLeft. */
  public Point getTopLeft() {
    return topLeft;
  }

  /**Setter topLeft. */
  public void setTopLeft(Point topLeft) {
    this.topLeft = topLeft;
  }

  /**Getter area. */
  @Override
  public double getArea() {
    return length * width;
  }

  /**Getter perimeter. */
  @Override
  public double getPerimeter() {
    return (length + width) * 2;
  }

  /**Override method equals. */
  @Override
  public boolean equals(Object obj) {
    Rectangle other = (Rectangle) obj;
    if (length == other.length && width == other.width && topLeft == other.topLeft) {
      return true;
    }
    return false;
  }

  /**Over ride function toString. */
  @Override
  public String toString() {
    return "Rectangle[topLeft=(" + String.format("%.1f", topLeft.getPointX()) + ","
            + String.format("%.1f", topLeft.getPointY()) + ")"
            + ",width=" + width + ",length=" + length + ",color="
            + getColor() + ",filled=" + isFilled() + "]";
  }
}
