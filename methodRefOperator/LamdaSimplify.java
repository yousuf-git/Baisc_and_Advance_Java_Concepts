import java.util.Arrays;
import java.util.List;

public class LamdaSimplify {
    public static void main(String[] args) {
        // --------------- using :: inside lambda ---------------

        List<String> names = Arrays.asList("John", "Freddy", "Samuel");

        // Method 1 of printing all values in the list
        names.forEach(name -> System.out.println(name));

        // Method 2 of printing all values in the list
        names.forEach(System.out::println);

    }
}
