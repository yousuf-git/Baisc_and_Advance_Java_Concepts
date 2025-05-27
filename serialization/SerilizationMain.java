/**
 * I first created a class that implements Serializable.
 * Here I am creating the object of that class and serializing it to a file.
 * Then I am deserializing it back to an object and printing it.
 */

import java.util.List;
import java.util.ArrayList;

public class SerilizationMain {
    public static void main(String[] args) {
        SerializationClass student = new SerializationClass("John Doe", 20);
        System.out.println("Original Object: " + student);

        // using ObjectOutputStream to write the object to a file and ObjectInputStream to read it back.
        String filePath = "student.ser"; // it can be txt
        
        try {
            // Serialize the object
            java.io.FileOutputStream fileOutStream = new java.io.FileOutputStream(filePath);
            java.io.ObjectOutputStream outStream = new java.io.ObjectOutputStream(fileOutStream);
            outStream.writeObject(student);
            outStream.close();
            fileOutStream.close();

            System.out.println("Serialized data is saved in " + filePath);

            // Deserialize the object
            java.io.FileInputStream fileIn = new java.io.FileInputStream(filePath);
            java.io.ObjectInputStream in = new java.io.ObjectInputStream(fileIn);
            SerializationClass deserializedStudent = (SerializationClass) in.readObject();
            in.close();
            fileIn.close();

            System.out.println("Deserialized Object: " + deserializedStudent);
        } catch (java.io.IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        // ============== Now storing multiple objects in a list and serializing them ==============
        List<SerializationClass> students = new ArrayList<>();
        students.add(new SerializationClass("Alice", 22));
        students.add(new SerializationClass("Bob", 23));
        students.add(new SerializationClass("Charlie", 24));
        
        System.out.println("Original List of Students: " + students);
        
        try {
            // Serialize the list of students
            java.io.FileOutputStream fileOutStream = new java.io.FileOutputStream("students.ser");
            java.io.ObjectOutputStream outStream = new java.io.ObjectOutputStream(fileOutStream);
            outStream.writeObject(students);
            outStream.close();
            fileOutStream.close();

            System.out.println("Serialized list of students is saved in students.ser");

            // Deserialize the list of students
            java.io.FileInputStream fileIn = new java.io.FileInputStream("students.ser");
            java.io.ObjectInputStream in = new java.io.ObjectInputStream(fileIn);
            List<SerializationClass> deserializedStudents = (List<SerializationClass>) in.readObject();
            in.close();
            fileIn.close();

            System.out.println("Deserialized List of Students: " + deserializedStudents);
        
        } catch (java.io.IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
