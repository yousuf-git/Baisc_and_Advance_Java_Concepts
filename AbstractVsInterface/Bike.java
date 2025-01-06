// This class will implement Drivable interface

package AbstractVsInterface;

public class Bike implements Drivable {
    // The type Bike must implement the inherited abstract method Drivable.run()
    @Override
    public void run() {
        System.out.println("Bike is Running...........!");
    }
    
    // Since we don't get any attributes from interface
    int speed;
    String compnay;
    public Bike(int speed, String compnay) {
        this.speed = speed;
        this.compnay = compnay;
    }
    @Override
    public String toString() {
        return "Bike [ speed = " + speed + ", compnay = " + compnay + " ]";
    }

    

}
