public class Triangle implements GeometricObject {
  private Point p1;
  private Point p2;
  private Point p3;

  /**Initialize Triangle default. */
  public Triangle(Point p1, Point p2, Point p3) throws RuntimeException {
    this.p1 = p1;
    this.p2 = p2;
    this.p3 = p3;
  
    if (p1.getPointX() == p2.getPointX() && p1.getPointY() == p2.getPointY()
        || p1.getPointX() == p3.getPointX() && p1.getPointY() == p3.getPointY()
        || p2.getPointX() == p3.getPointX() && p2.getPointY() == p3.getPointY()) {
      throw new RuntimeException("Not exist Triangle");
    }
    double x1 = p1.getPointX() - p2.getPointX();
    double y1 = p1.getPointY() - p2.getPointY();
    double x2 = p1.getPointX() - p3.getPointX();
    double y2 = p1.getPointY() - p3.getPointY();
    if (x1 / x2 == y1 / y2) {
      throw new RuntimeException("Not exist Triangle");
    }
  }

  /**Getter p1. */
  public Point getP1() {
    return p1;
  }

  /**Getter p2. */
  public Point getP2() {
    return p2;
  }

  /**Getter p3. */
  public Point getP3() {
    return p3;
  }

  /**Getter area. */
  public double getArea() {
    double p = (p1.distance(p2) + p2.distance(p3) + p3.distance(p1)) / 2;
    return Math.sqrt(p * (p - p1.distance(p2)) * (p - p2.distance(p3)) * (p - p3.distance(p1)));
  }

  /**Getter perimeter. */
  public double getPerimeter() {
    return p1.distance(p2) + p2.distance(p3) + p3.distance(p1);
  }

  /**Getter info. */
  public String getInfo() {
    return "Triangle[("
      + String.format("%.2f", p1.getPointX()) + "," + String.format("%.2f", p1.getPointY()) + "),("
      + String.format("%.2f", p2.getPointX()) + "," + String.format("%.2f", p2.getPointY()) + "),("
      + String.format("%.2f", p3.getPointX()) + "," + String.format("%.2f", p3.getPointY()) + ")]";
  }
}
