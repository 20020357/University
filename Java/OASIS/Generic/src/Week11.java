import java.util.Collections;
import java.util.List;

public class Week11 {
  /**Sort generic. */
  public static <T> List<T> sortGeneric(List<T> arr) {
    for (int i = 0; i < arr.size(); i++) {
      for (int j = i + 1; j < arr.size(); j++) {
        switch (arr.get(0).getClass().getSimpleName()) {
          case "Integer":
            if ((Integer) arr.get(i) > (Integer) arr.get(j)) {
              Collections.swap(arr, i, j);
            }
            break;
          case "String":
            if (((String) arr.get(i)).compareTo((String) arr.get(j)) > 0) {
              Collections.swap(arr, i, j);
            }
            break;
          default:
            if (((Person) arr.get(i)).getName().compareTo(((Person) arr.get(j)).getName()) > 0) {
              Collections.swap(arr, i, j);
            } else {
              if (((Person) arr.get(i)).getAge() > ((Person) arr.get(j)).getAge()) {
                Collections.swap(arr, i, j);
              }
            }
            break;
        }
      }
    }
    return arr;
  }
}
