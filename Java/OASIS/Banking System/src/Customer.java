import java.util.ArrayList;
import java.util.List;

public class Customer {
  private long idNumber;
  private String fullName;
  private List<Account> accountList = new ArrayList<Account>();

  /**Initialize Customer default. */
  public Customer() {}

  /**Initialize Customer with 2 parameters. */
  public Customer(long idNumber, String fullName) {
    this.idNumber = idNumber;
    this.fullName = fullName;
  }

  /**Getter idNumber. */
  public long getIdNumber() {
    return idNumber;
  }

  /**Setter idNumber. */
  public void setIdNumber(long idNumber) {
    this.idNumber = idNumber;
  }

  /**Getter fullName. */
  public String getFullName() {
    return fullName;
  }

  /**Setter fullName. */
  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  /**Getter accountList. */
  public List<Account> getAccountList() {
    return accountList;
  }

  /**Getter Customer Info. */
  public String getCustomerInfo() {
    return "Số CMND: " + idNumber + ". Họ tên: " + fullName + ".";
  }

  /**Add account. */
  public void addAccount(Account account) {
    accountList.add(account);
  }

  /**Remove account. */
  public void removeAccount(Account account) {
    
  }
}
