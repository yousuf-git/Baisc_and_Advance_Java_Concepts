package Enumeration;

/**
 *  Enum Definition - Its like a class in Java
 *  Can be Used where you have a set of related constants
 *  Enums can implement interfaces
 *  Every enum is subclass of Enum (no need to explicitly write " extends Enum ")
 *  That's why it has some methods:
 *  - values() returns an array of all the objects of it
 *  - ordinal() returns index of specific object (starts from 0)
 *  - valueOf() returns object of specific name
 */

enum Week {
    MONDAY, // ordinal 0
    TUESDAY, // ordinal 1
    WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY; // ordinal 2 ... 7
}


enum Week2 {
    MONDAY(1), TUESDAY(2), WEDNESDAY(3), THURSDAY(4), FRIDAY(5), SATURDAY(6), SUNDAY(7);

    // It can also have its attributes and constructor
    final int sr; // should be private so that no one can modify

    // constructor
    Week2(int sr) {
        this.sr = sr;
    }

}


public class Enum {
    public static void main(String[] args) {
        System.out.println("\n.....Enum Testing....\n");

        Week[] week = Week.values(); // returns array (each element is array is instance of Week enum)
        System.out.println("Enum Week\n");
        int sr = 1;
        for (int idx = 0; idx < week.length; idx++) {
            System.out.println((sr++) + ". " + week[idx]);
        }
        System.out.print("\nweek[0] is instance of Week enum: ");
        System.out.println(week[0] instanceof Week);

        System.out.println("\nEnum Week2\n");
        Week2[] week2 = Week2.values();
        for (Week2 wk : week2) {
            System.out.println(wk.sr + ". " + wk);
        }

        // Cannot compare different enum constants
        
        // Week type1 = Week.valueOf("MONDAY");
        // boolean isInstanceOf = type1 instanceof Week2; // Incompatible conditional operand types Week and Week2
        
        // Q: Explain error: boolean isInstanceOf = type1 instanceof Week2;
        // A: type1 is instance of Week enum, so it can't be instance of Week2 enum
        // Q: So it should give a false result, right?
        // A: No, it gives a compile time error: incompatible types: Enumeration.Week cannot be converted to Enumeration.Week2
        // Q: Why is it so?
        // A: Because, type1 is instance of Week enum, so it can't be instance of Week2 enum
        // Q: instanceOf method gives false if one instance doesn't belong to a class / enum, right?
        // A: Yes, but here it gives compile time error because of incompatible types
        // Q: Which types are compatible?
        // A: Only if they are in same hierarchy
        // Q: What is hierarchy?
        // A: It is the parent-child relationship
    }
}
