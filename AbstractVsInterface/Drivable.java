/*
 * Interfaces cannot be instatiaed
 * They cannot have simple fields 
 */

package AbstractVsInterface;

public interface Drivable {

    // int speed;                   Cannnot have simple fields, but final fields
    // final int speed = 20;        This is fine but not logical
    
    // All classes that will implement this interface will be forced to implement methods here
    public void run();              
}
