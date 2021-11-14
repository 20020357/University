public class Point {
  private double pointX;
  private double pointY;
  
  /**Initialize Point with coordinates. */
  public Point(double pointX, double pointY) {
    this.pointX = pointX;
    this.pointY = pointY;
  }

  /**Getter pointX. */
  public double getPointX() {
    return pointX;
  }

  /**Setter pointX. */
  public void setPointX(double pointX) {
    this.pointX = pointX;
  }

  /**Getter pointY. */
  public double getPointY() {
    return pointY;
  }

  /**Setter pointY. */
  public void setPointY(double pointY) {
    this.pointY = pointY;
  }

  /**Calculate distance between two points. */
  public double distance(Point p) {
    return Math.sqrt(Math.pow(pointX - p.pointX, 2) + Math.pow(pointY - p.pointY, 2));
  }

  /**Point equals. */
  @Override
  public boolean equals(Object obj) {
    Point other = (Point) obj;
    if (pointX == other.pointX && pointY == other.pointY) {
      return true;
    }
    return false;
  }

  /**Override method toString. */
  @Override
  public String toString() {
    return "(" + pointX + "," + pointY + ")";     
  }
}