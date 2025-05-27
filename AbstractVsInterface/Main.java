package AbstractVsInterface;

public class Main {
    public static void main(String[] args) {
        // Trying to create object of an abstract class
        // Vehicle vehicle = new Vehicle();    Cannot instatiate the type: Vehicle
        
        // Instantiated the sub class and using the attributes from abstract class
        Car car = new Car("Civic", 200);
        System.out.println(car);        // car.toString()

        Bike bike = new Bike(100, "CD");
        System.out.println(bike);
    }
    
}
