public class Student extends Person {
  private String program;
  private int year;
  private double fee;

  /**Initialize Student. */
  public Student(String name, String address, String program, int year, double fee) {
    super(name, address);
    this.program = program;
    this.year = year;
    this.fee = fee;
  }

  /**Getter program. */
  public String getProgram() {
    return program;
  }

  /**Setter program.*/
  public void setProgram(String program) {
    this.program = program;
  }

  /**Getter year.*/
  public int getYear() {
    return year;
  }

  /**Setter year.*/
  public void setYear(int year) {
    this.year = year;
  }

  /**Getter fee.*/
  public double getFee() {
    return fee;        
  }

  /**Setter fee.*/
  public void setFee(double fee) {
    this.fee = fee;
  }

  /**Override function toString. */
  @Override
  public String toString() {
    return "Student[" + super.toString()
      + ",program=" + program + ",year=" + year + ",fee=" + fee + "]";
  }
}