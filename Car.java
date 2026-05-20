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
    public void accelerate() {
        System.out.println("The " + make + " " + model + " is accelerating");
    }
    public void brake() {
        System.out.println("The " + make + " " + model + " is braking");
    }
    public String getMakeAndModel() {
        return make + " " + model;
    }

    public boolean isAntique() {
        int currentYear = java.time.Year.now().getValue();
        return (currentYear - year) > 25;
    }
}
