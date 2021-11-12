public class Division extends BinaryExpression {
  /**Initialize Division default. */
  public Division(Expression left, Expression right) {
    super(left, right);
  }

  /**Override toString method. */
  public String toString() {
    return "(" + left.toString() + " / " + right.toString() + ")";
  }

  /**Override evaluate method. */
  public double evaluate() throws ArithmeticException {
    if (right.evaluate() == 0) {
      throw new ArithmeticException("Lỗi chia cho 0");
    }

    return left.evaluate() / right.evaluate();
  }
}
