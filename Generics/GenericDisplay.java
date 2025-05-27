// With Generic

package Generics;

public class GenericDisplay<T> {
    // T is the type that will be passed while creating instance of this class, that type can be used in many ways
    T value;

    // Need only a single method for all types T
    public void display(T value) {
        System.out.println(value);
    }

    public void setValue(T value) {
        this.value = value;
    }
    
    // public void setVlaue(<?> value) {

    // }
    
    
    // Cannot use wild cards as a return type
    // public ? getValue() {
    //     return value;
    // }
}

// class Class<T extends Class1 & Interface1 & Interface2 ... >     
// only 1 class but many interfaces are allowes, Put class name before interface