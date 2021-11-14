public class Main {
  /**Main method. */
  public static void main(String[] args) {
    Person person = new Person("Nguyen Van A", "144 Xuan Thuy, Cau Giay, HN");
    Vehicle car = new Car("Mercedes-Benz", "S400", "30A - 888.88", person, 4);
    Vehicle motoBike = new MotorBike("Yamaha", "YZF-R6", "29 - P1 686.68", person, false);

    person.addVehicle(car);
    person.addVehicle(motoBike);
    System.out.println(person.getVehiclesInfo());

    person.removeVehicle("30A - 888.88");
    person.removeVehicle("29 - P1 686.68");
    System.out.println(person.getVehiclesInfo());
  }
}
