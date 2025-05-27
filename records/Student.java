/**
 * Record class representing a student.
 * It contains three fields: rollNo, name, and email.
 * Things to know about records:
 * - Records are immutable
 * - Records automatically generate equals(), hashCode(), and toString() methods
 * - Records cannot extend other classes (they implicitly extend java.lang.Record)
 * - Records implicitly creates final fields for each component passed in the constructor
 * - Automatically generates a constructor that takes all components as parameters
 * - Automatically generates accessor methods for each component, For example, for a record `Student`, it will generate `rollNo()`, `name()`, and `email()` methods that can be referred to as getters
 * - Records can implement interfaces
 * - Records can have a compact constructor (sometimes used for validation stuff)
 *      Example:
 *       ```
 *       public record Student(String rollNo, String name, String email) {
 *           public Student {
 *               if (rollNo == null || name == null || email == null) {
 *                   throw new IllegalArgumentException("Any of the fields cannot be null");
 *               }
 *           }
 *       }
 *      ```
 * - Records can have static fields and methods
 * - Records can have additional methods
 * 
 */
public record Student(String rollNo, String name, String email, String classStr) {}

