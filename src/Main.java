import java.util.*;

public class Main {
    public static void main(String[] args) {

        //task1
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7, 9));
        List<Integer> uniqueNums = new ArrayList<>();
        for (Integer num : nums) {
            if (!uniqueNums.contains(num)) {
                uniqueNums.add(num);
            }
        }
        for (int num : uniqueNums) {
            if (num % 2 != 0) {
                System.out.print(num);
            }

        }
        System.out.println("");

        //task2
        List<Integer> nums2 = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7, 8));
        List<Integer> uniqueNum = new ArrayList<>();
        for (Integer num : nums2) {
            if (!uniqueNum.contains(num)) {
                uniqueNum.add(num);
            }
        }
        for (int num : uniqueNum) {
            if (num % 2 == 0) {
                System.out.print(num);
            }
        }
        System.out.println("");

        //task3
        Set<String> words = new HashSet<>(List.of("один", "лодка", "лодка", "рыбалка", "рыбалка",
                "три", "три", "три", "машина", "машина"));
        for (String word : words) {
            System.out.println(word);
        }

        System.out.println("");
        //task4
        List<String> strings = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три"));
        Map<String, Integer> wordCounts = new HashMap<>();

        for (String word : strings) {
            wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
        }

        for (int count : wordCounts.values()) {
            System.out.println(count);
        }
    }
}