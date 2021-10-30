import java.util.ArrayList;

public class Account {
  private double balance;
  private ArrayList<Transaction> transitionList = new ArrayList<Transaction>();

  /** Deposit. */
  private void deposit(double amount) {
    if (amount > 0) {
      balance += amount;
    } else {
      System.out.println("So tien ban nap vao khong hop le!");
    }
  }

  /** Withdraw. */
  private void withdraw(double amount) {
    if (amount > 0) {
      if (amount < balance) {
        balance -= amount;
      } else {
        System.out.println("So tien ban rut vuot qua so du!");
      }
    } else {
      System.out.println("So tien ban rut ra khong hop le!");
    }
  }

  /** Add an transaction to list transaction. */
  public void addTransaction(double amount, String operation) {
    if (operation.equals(Transaction.DEPOSIT)) {
      deposit(amount);
      transitionList.add(new Transaction(operation, amount, this.balance));
    } else if (operation.equals(Transaction.WITHDRAW)) {
      withdraw(amount);
      transitionList.add(new Transaction(operation, amount, this.balance));
    } else {
      System.out.println("Yeu cau khong hop le!");
    }
  }

  /** Print transactions. */
  public void printTransaction() {
    for (int i = 0; i < transitionList.size(); i++) {
      if (transitionList.get(i).getOperation().equals(Transaction.DEPOSIT)) {
        System.out.println("Giao dich " + (i + 1) + ": Nap tien $"
            + String.format("%.2f", transitionList.get(i).getAmount()) + ". So du luc nay: $"
            + String.format("%.2f", transitionList.get(i).getBalance()) + '.');
      } else {
        System.out.println("Giao dich " + (i + 1) + ": Rut tien $"
            + String.format("%.2f", transitionList.get(i).getAmount()) + ". So du luc nay: $"
            + String.format("%.2f", transitionList.get(i).getBalance()) + '.');
      }
    }
  }
} 