public class MotorBike extends Vehicle {
  private boolean hasSidecar;

  /**Initialize motobike default. */
  public MotorBike(String brand, String model, String registrationNumber,
      Person owner, boolean hasSideCar) {
    super(brand, model, registrationNumber, owner);
    this.hasSidecar = hasSideCar;
  }

  /**Getter has side car. */
  public boolean isHasSidecar() {
    return hasSidecar;
  }

  /**Setter has side car. */
  public void setHasSidecar(boolean hasSidecar) {
    this.hasSidecar = hasSidecar;
  }

  /**Get info. */
  @Override
  public String getInfo() {
    return "Motor Bike:\n"
      + "\tBrand: " + getBrand() + "\n" + "\tModel: " + getModel() + "\n"
      + "\tRegistration Number: " + getRegistrationNumber() + "\n"
      + "\tHas Side Car: " + hasSidecar + "\n"
      + "\tBelongs to " + owner.getName() + " - " + owner.getAddress();
  }
}
