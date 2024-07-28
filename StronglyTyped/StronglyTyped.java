// Java is a strongly typed language, which means that all variables must first be declared before they can be used.
// This involves stating the variable's type and name.

// Static Typing: The type of variables is known at compile time.
// Dynamic Typing: The type of variables is known at runtime.

package StronglyTyped;

public class StronglyTyped {

    public static void main(String[] args) {
        int x = 5;
        // x = "Hello"; // Error: incompatible types: String cannot be converted to int
        
        var y = "harry";
        // y = 5; // Error: incompatible types: int cannot be converted to String

        // var z; // Error: cannot infer type for local variable z, z must be initialized with soma value

        System.out.println(x + " " + y);
    }
}
