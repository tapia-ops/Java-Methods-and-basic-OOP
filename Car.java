public class Car {
    // Attributes
    private String make;
    private String model;
    private int year;
    
    // Constructor
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Method
    public void displayInfo() {
        System.out.println("Car Information:");
        System.out.println("Make " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}
