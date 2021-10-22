import java.util.ArrayList;

public class StudentManagement {
  Student[] students = new Student[100];
  
  /** Do determine student s1 and s2 have a same class ?. */
  public static boolean sameGroup(Student s1, Student s2) {
    if ((s1.getGroup()).equals(s2.getGroup())) {
      return true;
    }
    return false;
  }

  /** Add a new student to students array. */
  public void addStudent(Student newStudent) {
    for (int i = 0; i < 100; i++) {
      if (students[i] == null) {
        students[i] = newStudent;
        break;
      }
    }
  }

  /**
   *  This method is used to sort students according to the available form.
   *  Classes sort in order of first apparence.
   *  Students sort in order of addition.
   */
  public String studentsByGroup() {
    ArrayList<String> groups = new ArrayList<String>();
    groups.add(students[0].getGroup());
    for (int i = 1; i < 100; i++) {
      if (students[i] == null) {
        break;
      }
      int count = 0;
      for (int j = 0; j < groups.size(); j++) {
        if ((students[i].getGroup()).equals(groups.get(j))) {
          count++;
          break;
        }
      }
      if (count == 0) {
        groups.add(students[i].getGroup());
      }
    }

    String list = "";
    for (int i = 0; i < groups.size(); i++) {
      list += groups.get(i) + "\n";
      for (int j = 0; j < 100; j++) {
        if (students[j] == null) {
          break;
        }
        if ((students[j].getGroup()).equals(groups.get(i))) {
          list += students[j].getInfo() + "\n";
        }
      }
    }
    return list;
  }

  /** This method is used to remove student with id from students array. */
  public void removeStudent(String id) {
    Student[] newStudents = new Student[students.length - 1];
    for (int i = 0, k = 0; i < 100; i++) {
      if (students[i] == null) {
        break;
      }
      if ((students[i].getId()).equals(id)) {
        continue;
      }
      newStudents[k++] = students[i];
    }
    this.students = newStudents;
  }
}