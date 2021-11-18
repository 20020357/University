import java.util.ArrayList;
import java.util.List;

public abstract class Account {
  public static final String CHECKING = "CHECKING";
  public static final String SAVINGS = "SAVINGS";
  long accountNumber;
  double balance;
  List<Transaction> transactionList = new ArrayList<Transaction>();

  /**Initialize Account default. */
  public Account() {}

  /**Initialize Account with 2 parameters. */
  public Account(long accountNumber, double balance) {
    this.accountNumber = accountNumber;
    this.balance = balance;
  }

  /**Getter account number. */
  public long getAccountNumber() {
    return accountNumber;
  }

  /**Getter balance. */
  public double getBalance() {
    return balance;
  }

  /**Do with drawing. */
  public void doWithdrawing(double amount) {
    withdraw(amount);
  }

  /**Do depositing. */
  public void doDepositing(double amount) {

  }

  /**With draw. */
  public abstract void withdraw(double amount);

  /**Deposit. */
  public abstract void deposit(double amount);

  /**Getter transaction history. */
  public String getTransactionHistory() {
    String transactionHistory = "Lịch sử giao dịch của tài khoảng " + accountNumber + ":\n";
    for (int i = 0; i < transactionList.size(); i++) {
      
    }
    return transactionHistory;
  }
}
