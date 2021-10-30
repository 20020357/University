public class Staff extends Person {
  private String school;
  private double pay;

  /**Initialize Staff. */
  public Staff(String name, String address, String school, double pay) {
    super(name, address);
    this.school = school;
    this.pay = pay;
  }

  /**Getter school. */
  public String getSchool() {
    return school;
  }

  /**Setter school. */
  public void setSchool(String school) {
    this.school = school;
  }

  /**Getter pay. */
  public double getPay() {
    return pay;
  }

  /**Setter pay. */
  public void setPay(double pay) {
    this.pay = pay;
  }

  /**Override function toString. */
  @Override
  public String toString() {
    return "Staff[" + super.toString() + ",school=" + school + ",pay=" + pay + "]";
  }
}