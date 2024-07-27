// Without generics
package Generics;

public class Display {
    // To display any value, I need a separate function for each type
    public void display(String value) {
        System.out.println(value);
    }
    public void display(int value) {
        System.out.println(value);
    }
    public void display(float value) {
        System.out.println(value);
    }

    // and so on......
}
