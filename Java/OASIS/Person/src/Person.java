public class Person {
  private String name;
  private String address;

  /**Initialize Person. */
  public Person(String name, String address) {
    this.name = name;
    this.address = address;
  }

  /**Getter name. */
  public String getName() {
    return name;
  }

  /**Getter address. */
  public String getAddress() {
    return address;
  }

  /**Setter address. */
  public void setAddress(String address) {
    this.address = address;
  }

  /**Over-ride function toString. */
  @Override
  public String toString() {
    return "Person[name=" + name + ",address=" + address + "]";
  }
}