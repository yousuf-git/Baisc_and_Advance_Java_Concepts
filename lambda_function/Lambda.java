// In this claass, use of lambda expression is shown.

package lambda_function;

public class Lambda {
    public static void main(String[] args) {
        /*
         * Method 1 to call the run method defined here:
         *  - Create a class that implements that interface and override the run method
         *  - Create object of that class and pass it to the run method
        */ 
        Car car  = new Car();
        run(car);

        /*
         * Method 2 to call the run method defined here:
         *  - Use lambda expression to create an object of the interface and pass it to the run method
         */
        run(() -> {
            System.out.println("Car is running");
        });

        printName((name) -> {
            System.out.println("Car's Owener is " + name);
        }, "John Doe");
    }

    /*
     * Since interfaces cannot be instatiated directly, we can use lambda expressions to create an object of the interface to pass here
     */
    public static void run(Runnable obj) {
        obj.run();
    }

    // Another interface with a single abstract method that takes a string as argument
    public static void printName(Runnable_2 obj, String str) {
        obj.printName(str);
    }
    
}
