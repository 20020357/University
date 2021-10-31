public class Car extends Vehicle {
  private int numberOfDoors;

  /**Initialize car default. */
  Car(String brand, String model, String registrationNumber, Person owner, int numberOfDoors) {
    super(brand, model, registrationNumber, owner);
    this.numberOfDoors = numberOfDoors;
  }

  /**Getter number of doors. */
  public int getNumberOfDoors() {
    return numberOfDoors;
  }

  /**Setter number of doors. */
  public void setNumberOfDoors(int numberOfDoors) {
    this.numberOfDoors = numberOfDoors;
  }

  /**Get info. */
  public String getInfo() {
    return "Car:\n"
      + "\tBrand: " + getBrand() + "\n" + "\tModel: " + getModel() + "\n"
      + "\tRegistration Number: " + getRegistrationNumber() + "\n"
      + "\tNumber of Doors: " + getNumberOfDoors() + "\n"
      + "\tBelongs to " + owner.getName() + " - " + owner.getAddress();
  }
}
