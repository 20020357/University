public class Fraction {
  private int numerator;
  private int denominator = 1;
  
  /** Getter for numerator. */
  public int getNumerator() {
    return numerator;
  }

  /** Setter for numerator. */
  public void setNumerator(int numerator) {
    this.numerator = numerator;
  }

  /** Getter for denominator. */
  public int getDenominator() {
    return denominator;
  }

  /** Setter for denominator. */
  public void setDenominator(int denominator) {
    if (denominator != 0) {
      this.denominator = denominator;
    }
  }

  Fraction(int numerator, int denominator) {
    if (denominator != 0) {
      this.numerator = numerator;
      this.denominator = denominator;
    }
  }

  /** Calculate gcd of numerator and denominator. */
  private int gcd(int a, int b) {
    if (b == 0) {
      return Math.abs(a);
    }
    return gcd(b, a % b);
  }

  /** Calculate lcm of numerator and denominator. */
  private int lcm(int a, int b) {
    return Math.abs(a * b) / gcd(a, b);
  }

  /** Reduce fraction. */
  public Fraction reduce() {
    int temp = gcd(numerator, denominator);
    numerator /= temp;
    denominator /= temp;

    return this;
  }

  /** The fraction is added by other fraction. */
  public Fraction add(Fraction fraction) {
    int temp = lcm(denominator, fraction.getDenominator());
    fraction.setNumerator(fraction.getNumerator() * (temp / fraction.getDenominator()));
    numerator = numerator * (temp / denominator) + fraction.getNumerator();
    denominator = temp;

    return this;
  }

  /** The fraction is subtracted by other fraction. */
  public Fraction subtract(Fraction fraction) {
    int temp = lcm(denominator, fraction.getDenominator());
    fraction.setNumerator(fraction.getNumerator() * (temp / fraction.getDenominator()));
    numerator = numerator * (temp / denominator) - fraction.getNumerator();
    denominator = temp;

    return this;
  }

  /** The fraction is multiplied by other fraction. */
  public Fraction multiply(Fraction fraction) {
    numerator *= fraction.getNumerator();
    denominator *= fraction.getDenominator();

    return this;
  }

  /** The fraction is divided by other fraction. */
  public Fraction divide(Fraction fraction) {
    if (fraction.getNumerator() != 0) {
      numerator *= fraction.getDenominator();
      denominator *= fraction.getNumerator();
    }

    return this;
  }

  /** Compare this fraction with other fraction. */
  public boolean equals(Object obj) {
    if (obj instanceof Fraction) {
      Fraction other = (Fraction) obj;
      other.reduce();
      if (numerator == other.getNumerator() && denominator == other.getDenominator()) {
        return true;
      }

      return false;
    }

    return false;
  }
}
