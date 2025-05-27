package Enumeration;
enum Planets {
    // Enum Constants
    MERCURY(3.303e+23, 2.4397e6),
    VENUS(4.869e+24, 6.0518e6),
    EARTH(5.976e+24, 6.37814e6),
    MARS (6.421e+23, 3.3972e6),
    JUPITER(1.9e+27, 7.1492e7),
    SATURN(5.688e+26, 6.0268e7),
    URANUS(8.686e+25, 2.5559e7),
    NEPTUNE(1.024e+26, 2.4746e7);


    // Attributes of objects
    private final double mass;   // in kilograms
    private final double radius; // in meters

    // Constructor
    Planets(double mass, double radius) {
        this.mass = mass;
        this.radius = radius;
    }

    // Getters for final Attributes
    public double mass() { return mass; }
    public double radius() { return radius; }

    // Universal gravitational constant in m^3 / kg s^2
    public static final double G = 6.67300E-11;

    // To calculate surface gravity
    public double surfaceGravity() {
        return G * mass / (radius * radius);
    }
}

// Driver class
public class PlanetsEnum {
    public static void main(String[] args) {
        Planets[] planets = Planets.values();
    
        System.out.println("\n________Planets Details________\n");
        
        int sr = 1;
        for (Planets planet : planets) {
            System.out.println("\t" + (sr++));
            System.out.println("Planet Name: " + planet);
            System.out.println("Mass (kg): " + planet.mass());
            System.out.println("Radius(m): " + planet.radius());
            System.out.println("Surface Gravity: " + planet.surfaceGravity());
            System.out.println();
        }
    }
    
}
