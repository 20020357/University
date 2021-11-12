public class ExpressionTest {
  /**Main method.*/
  public static void main(String[] args) {
    Numeral a = new Numeral(10);
    Numeral b = new Numeral(-3);
    Numeral c = new Numeral(4);
    Numeral d = new Numeral(3);
    Square x = new Square(new Addition(new Addition(new Square(a), b), new Multiplication(c, d)));
    System.out.println(x.toString());
    System.out.println(x.evaluate());

    try {
      Division y = new Division(a, new Numeral(0));
      System.out.println(y.toString());
      System.out.println(y.evaluate());
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
