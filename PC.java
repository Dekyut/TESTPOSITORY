public class PC {
  // Attributes/Properties
  private String manufacturer;
  private String model;
  private int memory;
  private int storage;
  private boolean isOn;
  
  // Constructor to initialize a new PC object
  public PC(String manufacturer, String model, int memory, int storage) {
    this.manufacturer = manufacturer;
    this.model = model;
    this.memory = memory;
    this.storage = storage;
    this.isOn = false;
  }
  
  // Behaviors/Methods
  public void turnOn() {
    this.isOn = true;
    System.out.println("The PC is turning on");
  }
  
  public void turnOff() {
    this.isOn = false;
    System.out.println("The PC is turning off");
  }
  
  public void runApplication(String appName) {
    if (this.isOn) {
      System.out.println("Running " + appName + " on the PC");
    } else {
      System.out.println("The PC is off, turn it on to run applications");
    }
  }
  
  // Getters to access the attributes
  public String getManufacturer() {
    return manufacturer;
  }
  
  public String getModel() {
    return model;
  }
  
  public int getMemory() {
    return memory;
  }
  
  public int getStorage() {
    return storage;
  }
  
  public boolean isOn() {
    return isOn;
  }
  
  // Main method to run the class
  public static void main(String[] args) {
    PC myPC = new PC("Dell", "Inspiron", 8, 256);
    System.out.println("Manufacturer: " + myPC.getManufacturer());
    System.out.println("Model: " + myPC.getModel());
    System.out.println("Memory: " + myPC.getMemory() + "GB");
    System.out.println("Storage: " + myPC.getStorage() + "GB");
    myPC.turnOn();
    myPC.runApplication("Google Chrome");
    myPC.turnOff();
  }
}
