import java.util.Arrays;

public class StaticMethodReference {
    public static void main(String[] args) {
        String[] names = {"Bob", "Alice", "Charlie"};

        // Using static method reference for Arrays.sort
        Arrays.sort(names, String::compareToIgnoreCase);

        System.out.println(Arrays.toString(names)); 
        // Output: [Alice, Bob, Charlie]
    }
}
