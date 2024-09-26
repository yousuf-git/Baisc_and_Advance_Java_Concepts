package Up_and_Down_Casting;

public class Circle extends Shape {
    double radius;

    Circle(String name) {
        super(name);
    }

    Circle(String name, double r) {
        super(name);
        this.radius = r;
    }

    public double getArea() {
        return 3.14 * radius * radius;
    }

    @Override
    public String toString() {
        return "Circle [name = " + name + ", radius = " + radius + "]";
    }
}
