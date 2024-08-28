/*

Optionals are mostly used to handle the methods which may return null, lets see...
If return type if Optional<Object> it means it may return an Object or not

Key Methods:

1. ofNullable(Object) - returns an Optional with the specified value, if the value is null it returns an empty Optional

2. isPresent() - returns true if the value is present, else false

3. get() - returns the value if present, else throws NoSuchElementException

4. orElse(Object) - returns the value if present, else returns the specified value

5. orElseGet(Supplier) - returns the value if present, else returns the value from the supplier

6. orElseThrow(Supplier) - returns the value if present, else throws the exception from the supplier

7. filter(Predicate) - returns an Optional with the value if the value satisfies the predicate, else returns an empty Optional

8. map(Function) - returns an Optional with the value if the value satisfies the function, else returns an empty Optional

9. flatMap(Function) - returns an Optional with the value if the value satisfies the function, else returns an empty Optional

10. empty() - returns an empty Optional

 */

package Optionals;

import java.util.Optional;

public class Optionals {
    public static void main(String[] args) {
        int age = 14;

        Optional<License> license = getLicense(age);
        // license.orElse(null); // can be used to get a default value if object is not present
        if (license.isPresent()) {
            System.out.println("License Number: " + license.get().licenseNumber);
        } else {
            System.out.println("Not eligible");
        }

    }

    public static Optional<License> getLicense(int age) {
        if (age >= 18) {
            return Optional.ofNullable(new License());
        } else {
            return Optional.ofNullable(null);
        }

    }
}
