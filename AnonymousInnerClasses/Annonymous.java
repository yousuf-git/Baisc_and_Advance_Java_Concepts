/*
 * These classes have no names and they have only one object
 * Can be created by 2 ways:
 *  - By Interfaces
 *  - By inheritance (extending an existing class)

Limitations with Anonymous Inner Classes

No Named Type: Since anonymous inner classes don't have a specific name, you can't declare variables of the anonymous type outside of the context where they are defined. This restricts the ability to use additional methods or properties added in the anonymous class outside of that context

Inheritance Limitations: Although you're technically extending a class or implementing an interface, the only accessible methods and fields outside the defining block are those defined in the parent class or interface. The custom methods or fields you've added in the anonymous inner class are not accessible unless you're within the same scope

Single Use Case: Anonymous inner classes are best suited for cases where you need a one-off implementation, such as event handling in a GUI, or for implementing a method of an interface or abstract class with minimal code

*/

package AnonymousInnerClasses;

public class Annonymous {
    public static void main(String[] args) {
        // We have a class Shape.java which is abstract class (cannot be instantiated
        // directly)

        @SuppressWarnings("unused")
        Shape sq = new Shape() {
            // now here we are inside a class

            // Can define attributes
            private double len = 5;

            public double getLen() {
                return len;
            }

            public void setLen(double len) {
                this.len = len;
            }

            // Since it's an anonymous class, we can't cast or access custom methods outside
            // But you can access them inside the same block where it was created

            // Only overridden methods will be utilized outside the scope
            public double area() {
                return len * len;
            }

        };

        // sq.setLen(5); // The method setLen(int) is undefined for the type Shape
        // System.out.println(sq.getLen()); // Undefined

        System.out.println(sq.area()); // Outputs: 25.0

        
        // Similarly in case of interfaces, we can 
        
        Runnable car = new Runnable() {
            // Here we are in an annonymous inner class that implements Runnable interface
            
            @Override
            public void run() {
                System.out.println("Car is Running in thread.......");
            }
        };
        
        car.run();
    }

}
