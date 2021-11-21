public class CheckingAccount extends Account {
  /**Initialize CheckingAccount default. */
  public CheckingAccount(long accountNumber, double balance) {
    super(accountNumber, balance);
  }

  /**Withdraw. */
  public void withdraw(double amount) {
    try {
      if (amount >= 0) {
        if (balance > amount) {
          Transaction transaction = new Transaction(2, amount, balance, balance - amount);
          transactionList.add(transaction);
        }
      }
      doWithdrawing(amount);
    } catch (Exception e) {
      //TODO: handle exception
      System.out.println(e.getMessage());
    }
  }

  /**Deposit. */
  public void deposit(double amount) {
    try {
      if (amount >= 0) {
        Transaction transaction = new Transaction(1, amount, balance, balance + amount);
        transactionList.add(transaction);
      }
      doDepositing(amount);
    } catch (Exception e) {
      //TODO: handle exception
      System.out.println(e.getMessage());
    }
  }
}
