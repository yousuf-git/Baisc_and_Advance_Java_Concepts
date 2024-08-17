package InnerClasses;

public class StaticClass {

    // Static class doesn't need object of outer class for its instantiation
    public static class StaticInnerClass {
        StaticInnerClass() {
            System.out.println("Static Class Instantiated.... !");
        }
    }

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        // StaticInnerClass static = new StaticInnerClass(); // Remember we can't use reserved word as variable name

        // Instantiating the inner static class
        StaticInnerClass static_class = new StaticInnerClass();

    }
}
