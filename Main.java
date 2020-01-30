import java.util.*;

class Main {
  public static void main(String[] args) {
    //Intializing.
    String[] date = {"12", "25", "20"};
    Car toyotaPrius = new Car(20000, date, 30);


    //Tests
    toyotaPrius.carInfo();
    toyotaPrius.turnOn();
    toyotaPrius.drive(20); //1 gallon
    toyotaPrius.honk();
    toyotaPrius.drive(400); // (400/20) = 20 gallons
    toyotaPrius.fillUp();
    toyotaPrius.drive(200); //10 gallon
    toyotaPrius.turnOff();
    toyotaPrius.carInfo();
    toyotaPrius.odometer();

  }

}