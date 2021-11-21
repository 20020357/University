import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.List;

public class App {
  /**Main method. */
  public static void main(String[] args) throws Exception {
    Bank bank = new Bank();
    InputStream inputStream = new FileInputStream(new File("src/Customer.txt"));
    bank.readCustomerList(inputStream);
    List<Customer> customerList = bank.getCustomerList();
    for (int i = 0; i < customerList.size(); i++) {
      System.out.println(customerList.get(i).getCustomerInfo());
      List<Account> accounts = customerList.get(i).getAccountList();
      for (int j = 0; j < accounts.size(); j++) {
        System.out.println(accounts.get(j).getAccountNumber() + " " + accounts.get(j).getBalance());
      }
    }

    System.out.println();
    System.out.println(bank.getCustomersInfoByNameOrder());

    // System.out.println();
    // System.out.println(bank.getCustomersInfoByIdOrder());
  }
}
