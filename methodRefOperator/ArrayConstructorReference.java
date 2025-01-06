import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.function.IntFunction;

public class ArrayConstructorReference {
    public static void main(String[] args) {
        
        // Array constructor reference
        IntFunction<int[]> arrayCreator = int[]::new;

        int[] arr = arrayCreator.apply(5);

        Arrays.fill(arr, 5);            // Fill the array with 5
        
        System.out.println(Arrays.toString(arr));       // Output: [5, 5, 5, 5, 5]
        System.out.println("Array length: " + arr.length);

        // Output: Array length: 5


    }
}
