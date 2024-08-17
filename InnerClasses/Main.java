package InnerClasses;

import InnerClasses.StaticClass.StaticInnerClass;

public class Main {

    public static void main(String[] args) {
        // Instantiating Outer class is simple
        Outer outer = new Outer(1, "outerStr");
        System.out.println(outer);
    
        // Inner inner = new Inner(); // Error: Inner cannot be resolved to a type
    
        // Outer.Inner inner = new Inner(); // still same error
    
        // Methods to instantiate inner class
        
        // 1. Use object of outer class to call the inner constructor
        Outer.Inner inner = outer.new Inner(2, "innerStr");
        System.out.println(outer); // no change in outer class, just a new object of inner is created
        System.out.println(inner); // here is info stored about that object
        
        // 2. Use a method in inner class that will create object and return it
        Outer.Inner inner2 = outer.createInnerClass(266, "56120 Rhoda Dam");
        System.out.println(inner2);

        @SuppressWarnings("unused")
        StaticInnerClass static_inner_class = new StaticInnerClass();
    }
}
