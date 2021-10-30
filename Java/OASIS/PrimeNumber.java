import java.util.Scanner;

public class PrimeNumber {
  static boolean isPrime(int n) {
    if (n <= 1) {
      return false;
    }

    boolean result = true;
    for (int i = 2; i < Math.sqrt(n); i++) {
      if (n % i == 0) {
        result = false;
        break;
      }
    }   
    return result;
  }

  /** This is main method.*/
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    scanner.close();
    if (isPrime(n)) {
      System.out.println(n + " is prime number!");
    } else {
      System.out.println(n + " is not prime number!");
    }
  }
}
