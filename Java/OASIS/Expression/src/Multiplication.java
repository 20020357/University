public class Multiplication extends BinaryExpression {
  /**Initialize Multiplication default. */
  public Multiplication(Expression left, Expression right) {
    super(left, right);
  }

  /**Override toString method. */
  public String toString() {
    return "(" + left.toString() + " * " + right.toString() + ")";
  }

  /**Override evaluate method. */
  public double evaluate() {
    return left.evaluate() * right.evaluate();
  }
}
