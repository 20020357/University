public class InvalidFundingAmountException extends BankException {
  /**Initialize invalid funding amount exception. */
  public InvalidFundingAmountException(double amount) {
    super("Số tiền không hợp lệ: $" + String.format("%.2f", amount));
  }
}
