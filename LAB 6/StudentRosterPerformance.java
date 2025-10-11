import java.util.*;

public class StudentRosterPerformance {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();

        // Add 50,000 students
        for (int i = 1; i <= 50000; i++) {
            String student = "Student " + i;
            arrayList.add(student);
            linkedList.add(student);
        }

        // Task A: Insertions at the Beginning
        long start = System.nanoTime();
        for (int i = 1; i <= 1000; i++) {
            arrayList.add(0, "New Student A" + i);
        }
        long arrayInsertTime = System.nanoTime() - start;

        start = System.nanoTime();
        for (int i = 1; i <= 1000; i++) {
            linkedList.add(0, "New Student L" + i);
        }
        long linkedInsertTime = System.nanoTime() - start;

        System.out.println("Insertion Time (ArrayList): " + arrayInsertTime / 1_000_000 + " ms");
        System.out.println("Insertion Time (LinkedList): " + linkedInsertTime / 1_000_000 + " ms");

        // Task B: Random Access
        Random rand = new Random();
        int size = arrayList.size();

        start = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            arrayList.get(rand.nextInt(size));
        }
        long arrayAccessTime = System.nanoTime() - start;

        start = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            linkedList.get(rand.nextInt(size));
        }
        long linkedAccessTime = System.nanoTime() - start;

        System.out.println("Random Access Time (ArrayList): " + arrayAccessTime / 1_000_000 + " ms");
        System.out.println("Random Access Time (LinkedList): " + linkedAccessTime / 1_000_000 + " ms");
    }
}
