public class MotoBike extends Vehicle {
  private boolean hasSideCar;

  /**Initialize motobike default. */
  public MotoBike(String brand, String model, String registrationNumber,
      Person owner, boolean hasSideCar) {
    super(brand, model, registrationNumber, owner);
    this.hasSideCar = hasSideCar;
  }

  /**Check side car. */
  public boolean isHasSideCar() {
    return hasSideCar;
  }

  /**Setter has side car. */
  public void setHasSideCar(boolean hasSideCar) {
    this.hasSideCar = hasSideCar;
  }

  /**Get info. */
  public String getInfo() {
    return "Moto Bike:\n"
      + "\tBrand: " + getBrand() + "\n" + "\tModel: " + getModel() + "\n"
      + "\tRegistration Number: " + getRegistrationNumber() + "\n"
      + "\tHas Side Car: " + hasSideCar + "\n"
      + "\tBelongs to " + owner.getName() + " - " + owner.getAddress();
  }
}
