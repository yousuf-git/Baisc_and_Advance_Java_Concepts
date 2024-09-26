/**

Simple generics:         <T>                 Any type T
Bounded Generics:    <T extends Class>       Any type is of given class or it subclass
Wild Card                <?>                 We don't know the type, decide on runtime
Bounded Wild Card    <? extends Class>       Any class or subclass of given Class


*/

package Generics;

import java.util.ArrayList;
import java.util.List;

class Generics {
    public static void main(String[] args) {

        Display simpleObj = new Display();
        simpleObj.display(1);
        // simpleObj.display(2.33d); // not applicable for the arguments (double) because we don't have that in class
        
        GenericDisplay<Double> obj = new GenericDisplay<>(); // just tell here which type you want to deal with 
        obj.display(2.342d); // the method display() can print that type now

        print(1373);
        print("harry");
        print(378293.32873);

        List<Integer> list = new ArrayList<>();
        list.add(6);
        list.add(9);
        printList(list);

    }

    // Shows an error: T cannot be resolved to a type
    // public static void print(T value) {
    //     System.out.println(value);
    // }

    public static <T> void print(T value) {
        System.out.println(value);
    }

    // A generic method that prints list of any type
    public static <T> void printList(List<T> list) {
        System.out.println(list);
    }
    
    // Same as above: by wild card
    public static void printList2(List<?> list) {
        System.out.println(list);
    }
    
}