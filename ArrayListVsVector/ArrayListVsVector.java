package ArrayListVsVector;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Vector;

public class ArrayListVsVector {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> vector = new Vector<>();

        int limit = 1000000; // 1M

        Random random = new Random();
        
        // Filling ArrayList
        long start = System.currentTimeMillis();
        for (int i = 0; i < limit; i++) {
            list.add(random.nextInt(50));
        }
        long end = System.currentTimeMillis();
        System.out.println("ArrayList filled in " + (end - start) + "ms");

        // Filling Vector
        start = System.currentTimeMillis();
        for (int i = 0; i < limit; i++) {
            vector.add(random.nextInt(50));
        }
        end = System.currentTimeMillis();
        System.out.println("Vector filled in " + (end - start) + "ms");
    }
}
