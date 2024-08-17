// This is a simple class that implements the Runnable interface and overrides the run method

package lambda_function;

public class Car implements Runnable {
    @Override
    public void run() {
        System.out.println("Car is running");
    }
}
