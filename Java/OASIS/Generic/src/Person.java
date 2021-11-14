public class Person {
  private String name;
  private int age;
  private String address;

  /**Initialize Person default. */
  Person() {
    name = null;
    age = 0;
    address = null;
  }
  
  /**Initialize Person with namd, age and address. */
  Person(String name, int age, String address) {
    this.name = name;
    this.age = age;
    this.address = address;
  }

  /**Getter name. */
  public String getName() {
    return name;
  }

  /**Setter name. */
  public void setName(String name) {
    this.name = name;
  }

  /**Getter age. */
  public int getAge() {
    return age;
  }

  /**Setter age. */
  public void setAge(int age) {
    this.age = age;
  }

  /**Getter address. */
  public String getAddress() {
    return address;
  }

  /**Setter address. */
  public void setAddress(String address) {
    this.address = address;
  }
}
