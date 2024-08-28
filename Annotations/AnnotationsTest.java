package Annotations;

import java.lang.reflect.Field;

public class AnnotationsTest {
    public static void main(String[] args) {
        Student std = new Student("53519", "Kathlyn", "Tools");

        // To check if a class has specific annotation
        if (Student.class.isAnnotationPresent(MyAnnotation.class)) {
            MyAnnotation myAnnotation = Student.class.getAnnotation(MyAnnotation.class);
            System.out.println("Value is: " + myAnnotation.value());
        } else {
            System.out.println("Annotation not present");
        }

        // Iterating over the fields of class and printing in uppercase if its important
        
        // System.out.println(std.getClass().getFields().length); // to verify that we are getting fields
        
        for (Field field : std.getClass().getFields()) {
            if (field.isAnnotationPresent(ImpField.class)) {
                // System.out.println(field);
                Object obj;
                try {
                    obj = field.get(std); // Get the field from the class as an Object
                    // If this object is String then typecast and store in dept
                    if (obj instanceof String dept) {
                        System.out.println(dept.toUpperCase());
                    }
                } catch (IllegalArgumentException | IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        } 

    }

}
