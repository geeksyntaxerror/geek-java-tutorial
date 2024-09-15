import java.util.*; // For ArrayList, LinkedList, Vector, Stack
import java.util.concurrent.CopyOnWriteArrayList; // For CopyOnWriteArrayList

public class ListCollectionDemo {
    public static void main(String[] args) {
        // 1. ArrayList Example
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Java");
        arrayList.add("Python");
        arrayList.add("C++");
        System.out.println("ArrayList: " + arrayList);
        arrayList.set(1, "JavaScript");
        System.out.println("ArrayList after update: " + arrayList);
        System.out.println("Element at index 2 in ArrayList: " + arrayList.get(2));

        // 2. LinkedList Example
        List<String> linkedList = new LinkedList<>();
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Mango");
        System.out.println("\nLinkedList: " + linkedList);
        linkedList.add(1, "Orange");
        System.out.println("LinkedList after insertion: " + linkedList);
        linkedList.remove("Mango");
        System.out.println("LinkedList after removal: " + linkedList);

        // 3. Vector Example
        List<String> vector = new Vector<>();
        vector.add("Tesla");
        vector.add("BMW");
        vector.add("Audi");
        System.out.println("\nVector: " + vector);
        vector.remove(1);
        System.out.println("Vector after removal: " + vector);

        // 4. Stack Example
        Stack<String> stack = new Stack<>();
        stack.push("HTML");
        stack.push("CSS");
        stack.push("JavaScript");
        System.out.println("\nStack: " + stack);
        System.out.println("Top element (peek): " + stack.peek());
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Stack after pop: " + stack);

        // 5. CopyOnWriteArrayList Example
        List<String> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        copyOnWriteArrayList.add("Thread1");
        copyOnWriteArrayList.add("Thread2");
        copyOnWriteArrayList.add("Thread3");
        System.out.println("\nCopyOnWriteArrayList: " + copyOnWriteArrayList);
        copyOnWriteArrayList.remove("Thread2");
        System.out.println("CopyOnWriteArrayList after removal: " + copyOnWriteArrayList);

        // Iterating through the CopyOnWriteArrayList
        System.out.println("\nIterating CopyOnWriteArrayList:");
        for (String s : copyOnWriteArrayList) {
            System.out.println(s);
        }
    }
}
