/*
 * Abstract classes cannot be instantiated but theie sub classes can be.
 * They can also have their fields and methods like other classes
 * Its like a basic structure for other classes to extend
 */

package AbstractVsInterface;

public abstract class Vehicle {

    String company;
    int speed;
    
    // public void run();       Cannot declare methods like that in interface
    
    public void run() {}
}
