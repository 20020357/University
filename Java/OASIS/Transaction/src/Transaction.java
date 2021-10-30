public class Transaction {
  private String operation;
  private double amount;
  private double balance;
  public static final String DEPOSIT = "deposit";
  public static final String WITHDRAW = "withdraw";

  /** Getter for operation. */
  public String getOperation() {
    return operation;
  }

  /** Setter for operation. */
  public void setOperation(String operation) {
    this.operation = operation;
  }

  /** Getter for amount. */
  public double getAmount() {
    return amount;
  }

  /** Setter for amount. */
  public void setAmount(double amount) {
    this.amount = amount;
  }

  /** Getter for balance. */
  public double getBalance() {
    return balance;
  }

  /** Setter for balance. */
  public void setBalance(double balance) {
    this.balance = balance;
  }

  Transaction(String operation, double amount, double balance) {
    this.operation = operation;
    this.amount = amount;
    this.balance = balance;
  }
} 