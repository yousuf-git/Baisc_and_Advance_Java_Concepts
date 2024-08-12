// This class will extend Vehicle Abstract class

package AbstractVsInterface;

// Class can extend only one class, but implement as many interfaces as required

public class Car extends Vehicle {
    // This class will have everything from Vehicle class, and it will not force to
    // override its methods but we can do according to requirements. since I left
    // that run() method empty so I'll override

    @Override
    public void run() {
        System.out.println("Car is running ............! ");
    }

    @Override
    public String toString() {
        return "Car [company = " + company + ", speed = " + speed + "]";
    }

    Car() {
    }

    Car(String comp, int speed) {
        // Inherited attributes
        this.company = comp;
        this.speed = speed;
    }

}
