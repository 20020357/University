public class Numeral extends Expression {
  private double value;

  /**Initialize Numeral default. */
  public Numeral() {}

  /**Initialize Numeral with value. */
  public Numeral(double value) {
    this.value = value;
  }

  /**toString representation. */
  public String toString() {
    return Integer.toString((int) value);
  }

  /**Getter value. */
  public double evaluate() {
    return value;
  }
}
