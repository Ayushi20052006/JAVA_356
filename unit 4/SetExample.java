// package unit 4;
import java.util.HashSet;
public class SetExample {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Apple"); // Duplicate, will not be added

        System.out.println("Set: " + set); // Output: Set: [Apple, Banana, Cherry]

        boolean containsBanana = set.contains("Banana");
        System.out.println("Contains Banana: " + containsBanana); // Output: Contains Banana: true

        set.remove("Cherry");
        System.out.println("Set after removing Cherry: " + set); // Output: Set after removing Cherry: [Apple, Banana]

        int size = set.size();
        System.out.println("Size of the Set: " + size); // Output: Size of the Set: 2
    }
}
