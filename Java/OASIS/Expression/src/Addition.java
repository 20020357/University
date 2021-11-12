public class Addition extends BinaryExpression {
  /**Initialize Addition default. */
  public Addition(Expression left, Expression right) {
    super(left, right);
  }

  /**toString representation. */
  public String toString() {
    return "(" + left.toString() + " + " + right.toString() + ")";
  }

  /**Override evaluate method. */
  public double evaluate() {
    return left.evaluate() + right.evaluate();
  }
}
