import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.EnumSet;
import java.util.Set;

// Enum to use with EnumSet
enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

public class SetCollectionDemo {
    public static void main(String[] args) {
        // 1. HashSet Example
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Cherry");
        hashSet.add("Apple");  // Duplicate, won't be added
        System.out.println("HashSet: " + hashSet);  // Unordered, no duplicates

        // 2. LinkedHashSet Example
        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Apple");
        linkedHashSet.add("Banana");
        linkedHashSet.add("Cherry");
        linkedHashSet.add("Apple");  // Duplicate, won't be added
        System.out.println("LinkedHashSet: " + linkedHashSet);  // Maintains insertion order

        // 3. TreeSet Example
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("Banana");
        treeSet.add("Apple");
        treeSet.add("Cherry");
        System.out.println("TreeSet: " + treeSet);  // Sorted in natural (alphabetical) order

        // 4. EnumSet Example
        EnumSet<Day> enumSet = EnumSet.of(Day.SATURDAY, Day.SUNDAY);  // Creating a weekend set
        System.out.println("EnumSet (Weekend): " + enumSet);  // EnumSet prints days in enum order

        // Adding more days to EnumSet
        enumSet.add(Day.FRIDAY);
        System.out.println("EnumSet (Including Friday): " + enumSet);
    }
}
