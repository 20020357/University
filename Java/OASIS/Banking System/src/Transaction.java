public class Transaction {
  public static final int TYPE_DEPOSIT_CHECKING = 1;
  public static final int TYPE_WITHDRAW_CHECKING = 2;
  public static final int TYPE_DEPOSIT_SAVINGS = 3;
  public static final int TYPE_WITHDRAW_SAVINGS = 4;
  private int type;
  private double amount;
  private double initialBalance;
  private double finalBalance;

  /**Initialize Transaction default. */
  public Transaction(int type, double amount, double initialBalance, double finalBalance) {
    this.type = type;
    this.amount = amount;
    this.initialBalance = initialBalance;
    this.finalBalance = finalBalance;
  }

  /**Getter transaction type String.  */
  private String getTransactionTypeString(int type) {
    String transactionType = "";
    switch (type) {
      case 1:
        transactionType = "Nạp tiền vãng lai";
        break;
      case 2:
        transactionType = "Rút tiền vãng lai";
        break;
      case 3:
        transactionType = "Nạp tiền tiết kiệm";
        break;
      case 4:
        transactionType = "Rút tiền tiết kiệm";
        break;
      default:
        break;
    }
    return transactionType;
  }

  /**Getter transaction summary. */
  public String getTransactionSummary() {
    String transactionSummary = "- Kiểu giao dịch: " + getTransactionTypeString(type)
                                + ". Số dư ban đầu: $" + String.format("%.2f", initialBalance)
                                + ". Số tiền: $" + String.format("%.2f", amount)
                                + ". Số dư cuối: $" + String.format("%.2f", finalBalance) + ".";
    return transactionSummary;
  }
}
