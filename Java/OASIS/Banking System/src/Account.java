import java.util.ArrayList;
import java.util.List;

public abstract class Account {
  public static final String CHECKING = "CHECKING";
  public static final String SAVINGS = "SAVINGS";
  protected long accountNumber;
  protected double balance;
  protected List<Transaction> transactionList = new ArrayList<Transaction>();

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

  /**Do withdrawing. */
  public void doWithdrawing(double amount) throws BankException {
    if (amount < 0) {
      throw new InvalidFundingAmountException(amount);
    } else {
      if (balance < amount) {
        throw new InsufficientFundsException(amount);
      } else {
        balance -= amount;
      }
    }
  }

  /**Do depositing. */
  public void doDepositing(double amount) throws BankException {
    if (amount < 0) {
      throw new InvalidFundingAmountException(amount);
    } else {
      balance += amount;
    }
  }

  /**Withdraw. */
  public abstract void withdraw(double amount);

  /**Deposit. */
  public abstract void deposit(double amount);

  /**Getter transaction history. */
  public String getTransactionHistory() {
    String transactionHistory = "Lịch sử giao dịch của tài khoản " + accountNumber + ":\n";
    for (int i = 0; i < transactionList.size(); i++) {
      transactionHistory += transactionList.get(i).getTransactionSummary() + "\n";
    }
    return transactionHistory;
  }

  /**Add transaction. */
  public void addTransaction(Transaction transaction) {
    transactionList.add(transaction);
  }

  /**Do two accounts check is the same ?. */
  public boolean equals(Object obj) {
    if (obj instanceof Account) {
      if (accountNumber == ((Account) obj).accountNumber) {
        return true;
      }
    }
    return false;
  }
}
