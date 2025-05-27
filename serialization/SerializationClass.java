/**
 * Serialization means converting an object into a byte stream,
 * which can then be saved to a file or sent over a network.
 * 
 * Deserialization is the reverse process, converting the byte stream back into an object.
 * 
 */


import java.io.Serializable;

public class SerializationClass implements Serializable {
    
    private static final long serialVersionUID = 1L; // Unique identifier for serialization
    // This is important for version control during serialization/deserialization, if not set, it may lead to InvalidClassException

    private String name;
    private int age;

    // Constructor
    public SerializationClass(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // toString method for easy representation
    @Override
    public String toString() {
        return "SerializationClass{name='" + name + "', age=" + age + '}';
    }

    
}
