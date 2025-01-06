/*

Throwbale
    - Error
    - Exception
        - Checked Exception
            - IOException
            - SQLException
            - FileNotFoundException
        - Runtime Exception
            - ArithmeticException
            - NullPointerException
            - ArrayIndexOutOfBoundsException
            - ClassCastException
            - IllegalArgumentException
            - NumberFormatException
            - IllegalStateException
            - UnsupportedOperationException
            - ConcurrentModificationException
            - PatternSyntax

All the runtime exceptions are unchecked exceptions, it means it depeneds on the programmer to handle them or not.

*/

package Exceptions;
import java.io.FileReader;
import java.io.IOException;

public class Exceptions {
    public static void main(String[] args){
        String file = "file.txt";
        readFile2(file);
        
        try {
            readFile3(file); // now you need to handle the exception here either by try-catch block or by throwing it to the calling function (main)
        } catch (IOException e) {
            e.printStackTrace(); // just to print the stack trace
        } 
    }
    
    // If we don't handle the checked exception, it will give an error
    // public void readFile(String file) {
    //     // FileReader fr = new FileReader(file); // Checked Exception, you need to handle it at compile time
    // }

    // Hanlding the checked exception by try-catch block
    public static void readFile2(String file) {
        try {
            FileReader fr = new FileReader(file);
            fr.close();
        } catch (IOException e) {
            System.out.println("File not found !");
        }
    }

    // Antoher way to handle the checked exception is to throw it to the calling function
    public static void readFile3(String file) throws IOException {
        FileReader fr = new FileReader(file);
        fr.close();
        // If any exception occcurse, it will be thrown as it is to the calling function
    }
}
