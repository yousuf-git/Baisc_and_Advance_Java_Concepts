import java.util.function.Supplier;

class Person {
    String name;

    Person() {
        this.name = "Unknown";
    }

    Person(String name) {
        this.name = name;
    }
}

public class ConstructorReferenceExample {
    public static void main(String[] args) {
        // --------------- Using constructor reference ---------------
        
        Supplier<Person> personSupplier = Person::new;
        // There is no requirement that a new or distinct result be returned each time
        // the supplier is invoked.
        // This is a functional interface whose functional method is get().

        Person person = personSupplier.get();
        System.out.println(person.name);        // Output: Unknown

        // --------------- Using constructor reference with parameter ---------------
        
        Supplier<Person> personSupplierWithName = () -> new Person("John");
        
        Person personWithName = personSupplierWithName.get();
        System.out.println(personWithName.name);    // Output: John
    }
}
