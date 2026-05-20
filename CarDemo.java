public class CarDemo {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Corolla", 2022);
        Car classicCar = new Car("Ford", "Mustang", 1965);
        
        myCar.displayInfo();
        myCar.accelerate();
        myCar.brake();

        System.out.println(classicCar.getMakeAndModel() + "is an antique " + classicCar.isAntique());

        Car[] carArray = {myCar, classicCar};
        for (Car car : carArray) {
            System.out.println(car.getMakeAndModel()+ " is antique " + car.isAntique());
        }
    }
}
