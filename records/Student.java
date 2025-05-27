/**
 * Record class representing a student.
 * It contains three fields: rollNo, name, and email.
 * Things to know about records:
 * - Records are immutable
 * - Records automatically generate equals(), hashCode(), and toString() methods
 * - Records can implement interfaces
 * - Records can have a compact constructor
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

