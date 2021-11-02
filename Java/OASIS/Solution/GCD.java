import java.util.Scanner;

public class GCD {
  static int gcd(int a, int b) {
    if (b == 0) {
      return Math.abs(a);
    }
    return gcd(b, (a % b));
  }

  /** This method is main of class. */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    scanner.close();
    System.out.println(gcd(a, b));
  }
}
