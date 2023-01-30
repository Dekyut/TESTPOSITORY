public class Car {
  
  // Attributes/Properties
  private String make;
  private String model;
  private int year;
  private int speed;
  
  // Constructor to initialize a new Car object
  public Car(String make, String model, int year) {
    this.make = make;
    this.model = model;
    this.year = year;
    this.speed = 0;
  }
  
  // Behaviors/Methods
  public void start() {
    System.out.println("The car is starting");
  }
  
  public void drive(int newSpeed) {
    this.speed = newSpeed;
    System.out.println("Driving at speed: " + this.speed + "mph");
  }
  
  public void stop() {
    this.speed = 0;
    System.out.println("The car has stopped");
  }
  
  // Getters to access the attributes
  public String getMake() {
    return make;
  }
  
  public String getModel() {
    return model;
  }
  
  public int getYear() {
    return year;
  }
  
  public int getSpeed() {
    return speed;
  }
}
