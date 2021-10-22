public class Square extends Rectangle {
  /**Initialize default Square. */
  public Square() {}    

  /**Initialize Square with side. */
  public Square(double side) {
    super(side, side);
  }

  /**Initialize Square with side, color and filled. */
  public Square(double side, String color, boolean filled) {
    super(side, side, color, filled);
  }

  /**Initialize Square with topLeft, side, color and filled. */
  public Square(Point topLeft, double side, String color, boolean filled) {
    super(topLeft, side, side, color, filled);
  }

  /**Getter side. */
  public double getSide() {
    return length;
  }

  /**Setter side. */
  public void setSide(double side) {
    length = width = side;
  }

  /**Over ride function setWidth. */
  @Override
  public void setWidth(double side) {
    width = length = side;
  }

  /**Override function setLength. */
  @Override
  public void setLength(double side) {
    length = width = side;
  }

  /**Override function equals. */
  @Override
  public boolean equals(Object obj) {
    if (obj instanceof Square) {
      Square other = (Square) obj;
      if (this.getSide() == other.getSide() && topLeft.equals(other.topLeft)) {
        return true;
      }
    }
    return false;
  }

  /**Override function toString. */
  @Override
  public String toString() {
    return "Square[topLeft=(" + String.format("%.1f", topLeft.getPointX()) + ","
            + String.format("%.1f", topLeft.getPointY()) + ")"
            + ",side=" + getSide() + ",color=" + getColor() + ",filled=" + isFilled() + "]";
  }
}
