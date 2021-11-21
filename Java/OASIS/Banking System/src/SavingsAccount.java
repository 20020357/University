public class SavingsAccount extends Account {
  /**Initialize SavingsAccount default. */
  public SavingsAccount(long accountNumber, double balance) {
    super(accountNumber, balance);
  }

  /**Withdraw. */
  public void withdraw(double amount) {
    try {
      if (amount <= 1000) {
        if (balance - amount >= 5000) {
          if (amount >= 0) {
            Transaction transaction = new Transaction(4, amount, balance, balance - amount);
            transactionList.add(transaction);
          }
          doWithdrawing(amount);
        }
      }
    } catch (Exception e) {
      //TODO: handle exception
      System.out.println(e.getMessage());
    }
  }

  /**Deposit. */
  public void deposit(double amount) {
    try {
      if (amount >= 0) {
        Transaction transaction = new Transaction(3, amount, balance, balance + amount);
        transactionList.add(transaction);
      }
      doDepositing(amount);
    } catch (Exception e) {
      //TODO: handle exception
      System.out.println(e.getMessage());
    }
  }
}
