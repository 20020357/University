public class Square extends Expression {
  private Expression expression;

  /**Initialize Square with expression. */
  public Square(Expression expression) {
    this.expression = expression;
  }

  /**Override toString. */
  public String toString() {
    return "(" + expression.toString() + ") ^ 2";
  }

  /**Override evaluate. */
  public double evaluate() {
    return Math.pow(expression.evaluate(), 2);
  }
}
