public abstract class Shape {
  protected String color;
  protected boolean filled;
  
  /**Initialize default Shape. */
  public Shape() {}

  /**Initialize Shape with argument. */
  public Shape(String color, boolean filled) {
    this.color = color;
    this.filled = filled;
  }

  /**Getter color. */
  public String getColor() {
    return color;
  }
  
  /**Setter color. */
  public void setColor(String color) {
    this.color = color;
  }

  /**Getter filled. */
  public boolean isFilled() {
    return filled;
  }
  
  /**Setter filled. */
  public void setFilled(boolean filled) {
    this.filled = filled;
  }
  
  /**Getter area. */
  public abstract double getArea();
  
  /**Getter perimeter. */
  public abstract double getPerimeter();
  
  /**Over ride function toString. */
  @Override
  public String toString() {
    return "Shape[color=" + color + ",filled=" + filled + "]";
  }
}