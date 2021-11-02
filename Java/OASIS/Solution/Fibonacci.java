import java.util.Scanner;

public class Fibonacci {
  static long fibonacci(long number) {
    if (number < 0) {
      return -1;
    }
    if (number == 0) {
      return 0;
    }
    if (number == 1) {
      return 1;
    }

    long previousNumber = 0; 
    long nextNumber = 1; 
    long sum = 0;
    for (int i = 2; i <= number; i++) { 
      sum = previousNumber + nextNumber;
      previousNumber = nextNumber;
      nextNumber = sum;
    }
    if (sum < 0) {
      sum = Long.MAX_VALUE;
    }
    return sum;
  }

  /**.
   * This method is main of class
  */ 
  public static void main(String[] agrs) {
    Scanner scanner = new Scanner(System.in);
    int number = scanner.nextInt();
    scanner.close();
    System.out.println(fibonacci(number));
  }
}
