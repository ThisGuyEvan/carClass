import java.util.*;

class Car{

  private double totalMileage;
  private String[] date;
  private double gasTank;
  private double gasLevel;
  private double mileage;
  private boolean power;
  private double odometer;
  
  //Constructor 
  public Car(double mileage, String[] date, double gasTank){
    this.totalMileage = mileage;
    this.mileage = mileage;
    this.date = date;
    this.gasTank = gasTank;
    this.gasLevel = gasTank;
    this.power = false;
    this.odometer = 0;
  }

  public void drive(double miles){
    //Intialzing vars
    mileage -= miles;
    gasLevel -= miles/20;
    odometer += miles;
    //Test for gas and mileage of car.
    if (this.power == true){
      if (mileage > 0 && gasLevel > 0){
        System.out.println("Your car has travelled " + miles + " miles!");
      }
      //If has issue:
      else{
        gasLevel += miles/20;
        while (true){ //Run too see how many miles can be driven.
          
          if (totalMileage <= 0){
            System.out.println("Your car has no more mileage! Buy a new car!");
            break;
          }
          if(gasLevel <= 3){
            System.out.println("Warning! Go to the nearest gas station and fill up! Current miles driven: " + (totalMileage - (totalMileage - (gasLevel * 20))));
            break;
          }
          gasLevel--;
          totalMileage -= gasLevel * 20;
        }
      }
    }
    if (this.power == false){
      System.out.println("Your car is not powered on!");
    }
  }
  //Car info from Constructor givens.
  public void carInfo(){
    System.out.println("\n______________________\n   Car Infomation\n______________________");
    System.out.println("Model: Toyota Prius.");

    System.out.print("Date: ");
    for (int i = 0; i < date.length-1; i++){
      System.out.print(date[i] + "/");
    }
    System.out.println(date[date.length-1]);

    System.out.println("Gas Tank: " + gasTank);
    System.out.println("Gas Level: " + gasLevel);
    System.out.println("MPG: 17g/m");
    if (this.power == true){
      System.out.println("Power: [On]\n");
    }
    else{
      System.out.println("Power: [Off]\n");
    }

  }

  //On off methods.
  public void turnOn(){
    this.power = true;
    System.out.println("Power: [On]");
  }

  public void turnOff(){
    this.power = false;
    System.out.println("Power: [Off]");
  }

  public void honk(){
    System.out.println("Beep! beep!");
  }

  //Reset gas
  public void fillUp(){
    this.gasLevel = gasTank;
    this.gasTank = gasLevel;

    System.out.println("You've filled up your gas tank!");
  }

  //Odometer
  public void odometer(){
    System.out.println("Your car driven: " + odometer + "miles!");
  }



}