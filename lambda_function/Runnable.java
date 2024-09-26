// This is an interface, any class that implements this interface must override the run method

package lambda_function;

@FunctionalInterface // Since this interface has single abstract method, it is a functional interface
public interface Runnable {
    // Abstract method
    void run();

}

interface Runnable_2 {
    void printName(String name);
}