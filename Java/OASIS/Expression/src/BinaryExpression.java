public abstract class BinaryExpression extends Expression {
  protected Expression left;
  protected Expression right;

  /**Initialize BinaryExpression with left and right. */
  public BinaryExpression(Expression left, Expression right) {
    this.left = left;
    this.right = right;
  }

  /**toString representation.*/
  public abstract String toString();
  
  public abstract double evaluate();
}
