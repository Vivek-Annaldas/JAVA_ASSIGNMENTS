import java.io.*;
import java.util.*;

public class UniqueWordCounter {
    public static void main(String[] args) {
        String filePath = "sample.txt";
        countUniqueWords(filePath);
    }

    public static void countUniqueWords(String filePath) {
        Set<String> hashSet = new HashSet<>();
        Set<String> treeSet = new TreeSet<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.toLowerCase().replaceAll("[^a-z0-9 ]", "").split("\s+");
                for (String word : words) {
                    if (!word.isEmpty()) {
                        hashSet.add(word);
                        treeSet.add(word);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Unique word count: " + hashSet.size());

        System.out.println("\nUnique words in alphabetical order:");
        for (String word : treeSet) {
            System.out.println(word);
        }
    }
}
