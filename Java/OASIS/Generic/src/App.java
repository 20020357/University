import java.util.ArrayList;
import java.util.List;

public class App {
  /**Main method.*/
  public static void main(String[] args) {
    List<Person> person = new ArrayList<Person>();
    person.add(new Person("Nguyen A", 20, "UET"));
    person.add(new Person("Nguyen A", 22, "UET"));
    person.add(new Person("Le B", 20, "UET"));

    Week11.sortGeneric(person);

    for (int i = 0; i < person.size(); i++) {
      System.out.println(person.get(i).getName() + ", " + person.get(i).getAge() + ", "
                          + person.get(i).getAddress());
    }
    System.out.println();

    List<Integer> integer = new ArrayList<Integer>();
    integer.add(1);
    integer.add(2);
    integer.add(3);
    integer.add(4);
    
    Week11.sortGeneric(integer);

    for (int i = 0; i < integer.size(); i++) {
      System.out.print(integer.get(i) + " ");
    }
    System.out.println();
    System.out.println();
    
    List<String> string = new ArrayList<String>();
    string.add("Hoang");
    string.add("Hieu");
    string.add("Tuan Anh");
    string.add("Kien");

    Week11.sortGeneric(string);

    for (int i = 0; i < string.size(); i++) {
      System.out.println(string.get(i) + " ");
    }
    System.out.println();
  }
}
