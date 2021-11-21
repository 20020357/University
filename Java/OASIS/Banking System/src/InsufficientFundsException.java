public class InsufficientFundsException extends BankException {
  /**Initialize insufficient funds exception.*/
  public InsufficientFundsException(double amount) {
    super("Số dư tài khoản không đủ $" + String.format("%.2f", amount) + " để thực hiện giao dịch");
  }
}
