import java.util.ArrayList;
import java.util.List;

public class Person {
  private String name;
  private String address;
  private List<Vehicle> vehicleList = new ArrayList<Vehicle>();

  /**Initialize Person default. */
  public Person(String name, String address) {
    this.name = name;
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

  /**Getter address. */
  public String getAddress() {
    return address;
  }

  /**Setter address. */
  public void setAddress(String address) {
    this.address = address;
  }

  /**Add vehicle. */
  public void addVehicle(Vehicle vehicle) {
    vehicleList.add(vehicle);
  }

  /**Remove vehicle. */
  public void removeVehicle(String registrationNumber) {
    for (int i = 0; i < vehicleList.size(); i++) {
      if (vehicleList.get(i).getRegistrationNumber().equals(registrationNumber)) {
        vehicleList.remove(i);
        break;
      }
    }
  }

  /**Get vehicle info. */
  public String getVehicleInfo() {
    String result = name;
    if (vehicleList.size() != 0) {
      result += " has:\n";
      for (int i = 0; i < vehicleList.size(); i++) {
        if (vehicleList.get(i) instanceof Car) {
          Car car = (Car) vehicleList.get(i);
          result += car.getInfo() + "\n";
        }

        if (vehicleList.get(i) instanceof MotoBike) {
          MotoBike motoBike = (MotoBike) vehicleList.get(i);
          result += motoBike.getInfo() + "\n";
        }
      }
    } else {
      result += " has no vehicle!";
    }
    return result;
  }
}
