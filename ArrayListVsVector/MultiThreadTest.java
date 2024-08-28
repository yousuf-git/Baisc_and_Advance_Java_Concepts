package ArrayListVsVector;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Vector;


public class MultiThreadTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> vector = new Vector<>();

        int limit = 1000000; // 1M

        // Filling ArrayList in 2 threads - Million elements in each thread
        
        long start = System.currentTimeMillis();
        
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                fillList(list, limit);
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                fillList(list, limit);
            }
        });
        thread1.start();
        thread2.start();
        
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println("ArrayList filled in " + (end - start) + "ms");

        // Filling vector in 2 threads - Million elements in each thread
        
        start = System.currentTimeMillis();
        
        thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                fillList(vector, limit);
            }
        });
        thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                fillList(vector, limit);
            }
        });
        thread1.start();
        thread2.start();
        
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        end = System.currentTimeMillis();
        System.out.println("ArrayList filled in " + (end - start) + "ms");

        // Verifying 
        
        System.out.println("ArrayList size: " + list.size()); // Surprise
        System.out.println("Vector size: " + vector.size()); // 2M

        // Use this Definition of ArrayList to work in Multi-Threaded environments
        // List<Integer> list = Collections.synchronizedList(new ArrayList<>());

        System.out.println(System.currentTimeMillis());
    }

    static void fillList(List<Integer> list, int limit) {
        Random random = new Random();
        for (int i = 0; i < limit; i++) {
            list.add(random.nextInt(50));
        }
    }
}
