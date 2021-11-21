import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Bank {
  private List<Customer> customerList = new ArrayList<Customer>();

  /**Getter customer list. */
  public List<Customer> getCustomerList() {
    return customerList;
  }

  /**Read customer list. */
  public void readCustomerList(InputStream inputStream) {
    String line = null;
    try {
      BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
      while ((line = reader.readLine()) != null) {
        String[] input = line.trim().split(" ");
        
        try {
          long accountNumber = Long.parseLong(input[0]);
          double balance = Double.parseDouble(input[2]);
          Customer customer = customerList.get(customerList.size() - 1);

          if (input[1].equals(Account.CHECKING)) {
            customer.addAccount(new CheckingAccount(accountNumber, balance));
          }
          if (input[1].equals(Account.SAVINGS)) {
            customer.addAccount(new SavingsAccount(accountNumber, balance));
          }
        } catch (Exception e) {
          //TODO: handle exception
          String name = String.join(" ", Arrays.copyOf(input, input.length - 1));
          long idNumber = Long.parseLong(input[input.length - 1]);
          customerList.add(new Customer(idNumber, name));
        }
      }
      reader.close();
    } catch (Exception e) {
      //TODO: handle exception
      e.printStackTrace();
    }
  }

  /**Getter customers info by name order. */
  public String getCustomersInfoByNameOrder() {
    String result = "";
    for (int i = 0; i < customerList.size(); i++) {
      for (int j = i + 1; j < customerList.size(); j++) {
        if (customerList.get(i).getFullName().compareTo(customerList.get(j).getFullName()) > 0) {
          Collections.swap(customerList, i, j);
        }
      }
      result += customerList.get(i).getCustomerInfo();
      if (i + 1 < customerList.size()) {
        result += "\n";
      }
    }
    return result;
  }

  /**Getter customers info by id order. */
  public String getCustomersInfoByIdOrder() {
    String result = "";
    for (int i = 0; i < customerList.size(); i++) {
      for (int j = i + 1; j < customerList.size(); j++) {
        if (customerList.get(i).getIdNumber() > customerList.get(j).getIdNumber()) {
          Collections.swap(customerList, i, j);
        }
      }
      result += customerList.get(i).getCustomerInfo();
      if (i + 1 < customerList.size()) {
        result += "\n";
      }
    }
    return result;
  }
}
