package Up_and_Down_Casting;

public class CastingTests {
    public static void main(String[] args) {
        Shape sq = new Square("MySquare", 4); // up-casting: automatically done by java
        // Shape sq = (Shape) new Square("MySquare", 4); // same as above

        // sq has all methods and attributes of shape class, but only overriden methods of square class
        // System.out.println(sq.len); // len cannot be resolved or is not a field
        // sq.getArea(); // The method getArea() is undefined for the type Shape

        System.out.println(sq.toString()); // method in square class will be called here

        // Circle c = new Shape("MyCircle"); // Type mismatch: cannot convert from Shape to Circle
        Shape cir = new Circle("MyCircle", 3.65);

        System.out.println("\nAttributes: ");
        displayAttr(sq);
        displayAttr(cir);
    }

    // If we don't up-cast, we need separate methods for each sub-class
    // public static void displayAttr(Circle cir) {
    // System.out.println(cir.toString());
    // }

    // public static void displayAttr(Square sq) {
    // System.out.println(sq.toString());
    // }

    // But this method can have any obj that belongs to Shape class or any of its
    // sub-class
    public static void displayAttr(Shape shape) {
        System.out.println(shape.toString());

        // But still here we cannot access the un-overriden methods of any sub-class
        // shape.getArea();

        // To access sub-class methods or attributes, we need to down-cast explicitly
        // Square sq = (Square) shape ;
        // System.out.println(sq.getArea()); // it will work now

        // But if by somehow, any object other than of Square is passed, it will not work,
        // For that we need to validate first:
        if (shape instanceof Square) {
            Square sq = (Square) shape;
            System.out.println("Area of " + sq.name + " = " + sq.getArea());
        }
    }
}
