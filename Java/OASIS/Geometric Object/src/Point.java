public class Point {
  private double pointX;
  private double pointY;

  /**Initialize Point default. */
  public Point(double x, double y) {
    pointX = x;
    pointY = y;
  }

  /**Getter pointX. */
  public double getPointX() {
    return pointX;
  }

  /**Setter pointX. */
  public void setPointX(double x) {
    this.pointX = x;
  }

  /**Getter pointY. */
  public double getPointY() {
    return pointY;
  }

  /**Setter pointY. */
  public void setPointY(double y) {
    this.pointY = y;
  }

  /**Calculate distance between two points. */
  public double distance(Point other) {
    return Math.sqrt(Math.pow(pointX - other.pointX, 2) + Math.pow(pointY - other.pointY, 2));
  }
}
