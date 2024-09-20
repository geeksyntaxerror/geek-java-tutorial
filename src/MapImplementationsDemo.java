import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.Hashtable;
import java.util.EnumMap;
import java.util.Map;

public class MapImplementationsDemo {
    // Define an enum for EnumMap
    enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    public static void main(String[] args) {
        // 1. HashMap
        System.out.println("1. HashMap:");
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Apple", 1);
        hashMap.put("Banana", 2);
        hashMap.put("Cherry", 3);
        System.out.println("HashMap: " + hashMap);

        // 2. LinkedHashMap
        System.out.println("\n2. LinkedHashMap:");
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("Apple", 1);
        linkedHashMap.put("Banana", 2);
        linkedHashMap.put("Cherry", 3);
        System.out.println("LinkedHashMap: " + linkedHashMap);

        // 3. TreeMap
        System.out.println("\n3. TreeMap:");
        Map<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Banana", 2);
        treeMap.put("Apple", 1);
        treeMap.put("Cherry", 3);
        System.out.println("TreeMap: " + treeMap);

        // 4. Hashtable
        System.out.println("\n4. Hashtable:");
        Map<String, Integer> hashtable = new Hashtable<>();
        hashtable.put("Apple", 1);
        hashtable.put("Banana", 2);
        hashtable.put("Cherry", 3);
        System.out.println("Hashtable: " + hashtable);

        // 5. EnumMap
        System.out.println("\n5. EnumMap:");
        Map<Day, String> enumMap = new EnumMap<>(Day.class);
        enumMap.put(Day.MONDAY, "Start of the work week");
        enumMap.put(Day.FRIDAY, "End of the work week");
        enumMap.put(Day.SATURDAY, "Weekend!");
        System.out.println("EnumMap: " + enumMap);
    }
}
