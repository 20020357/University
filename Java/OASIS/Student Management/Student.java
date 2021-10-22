public class Student {
  private String name;
  private String id; 
  private String group;
  private String email;

  /** getter for name. */
  public String getName() {
    return name;
  }

  /** setter for name. */
  public void setName(String name) {
    this.name = name;
  }

  /** getter for id. */
  public String getId() {
    return id;
  }

  /** setter for id. */
  public void setId(String id) {
    this.id = id;
  }
  
  /** getter for group. */
  public String getGroup() {
    return group;
  }

  /** setter for group. */
  public void setGroup(String group) {
    this.group = group;
  }

  /** getter for email. */
  public String getEmail() {
    return email;
  }

  /** setter for email. */
  public void setEmail(String email) {
    this.email = email;
  }

  String getInfo() {
    String result = name + " - " + id + " - " + group + " - " + email;
    return result;
  }

  Student() {
    name = "Student";
    id = "000";
    group = "K62CB";
    email = "uet@vnu.edu.vn";
  }

  Student(String name, String id, String email) {
    this.name = name;
    this.id = id;
    this.group = "K62CB";
    this.email = email;
  }

  Student(Student s) {
    this.name = s.name;
    this.id = s.id;
    this.group = s.group;
    this.email = s.email;
  }
}