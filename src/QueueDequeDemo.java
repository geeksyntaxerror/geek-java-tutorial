import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Deque;

public class QueueDequeDemo {
    public static void main(String[] args) {
        // 1. LinkedList as a Queue (FIFO)
        System.out.println("1. LinkedList as Queue (FIFO):");
        Queue<String> linkedListQueue = new LinkedList<>();
        linkedListQueue.offer("John");
        linkedListQueue.offer("Jane");
        linkedListQueue.offer("Jack");
        System.out.println("Queue: " + linkedListQueue);  // Output: [John, Jane, Jack]
        System.out.println("Poll: " + linkedListQueue.poll());  // Removes John (FIFO)
        System.out.println("Queue after poll: " + linkedListQueue);  // Output: [Jane, Jack]

        // 2. PriorityQueue (based on natural order)
        System.out.println("\n2. PriorityQueue (Natural Ordering):");
        Queue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.offer(30);
        priorityQueue.offer(10);
        priorityQueue.offer(20);
        System.out.println("PriorityQueue: " + priorityQueue);  // Output: [10, 30, 20] (internal order)
        System.out.println("Poll: " + priorityQueue.poll());  // Removes 10 (smallest element)
        System.out.println("PriorityQueue after poll: " + priorityQueue);  // Output: [20, 30]

        // 3. LinkedList as a Deque (Double-ended)
        System.out.println("\n3. LinkedList as Deque (Double-ended Queue):");
        Deque<String> linkedListDeque = new LinkedList<>();
        linkedListDeque.addFirst("First");
        linkedListDeque.addLast("Last");
        System.out.println("Deque: " + linkedListDeque);  // Output: [First, Last]
        System.out.println("Remove First: " + linkedListDeque.removeFirst());  // Removes First
        System.out.println("Remove Last: " + linkedListDeque.removeLast());  // Removes Last

        // 4. ArrayDeque as a Queue (FIFO)
        System.out.println("\n4. ArrayDeque as Queue (FIFO):");
        Deque<String> arrayDeque = new ArrayDeque<>();
        arrayDeque.offerLast("John");
        arrayDeque.offerLast("Jane");
        arrayDeque.offerLast("Jack");
        System.out.println("ArrayDeque as Queue: " + arrayDeque);  // Output: [John, Jane, Jack]
        System.out.println("Poll First: " + arrayDeque.pollFirst());  // Removes John (FIFO)
        System.out.println("ArrayDeque after poll: " + arrayDeque);  // Output: [Jane, Jack]

        // 5. ArrayDeque as a Stack (LIFO)
        System.out.println("\n5. ArrayDeque as Stack (LIFO):");
        arrayDeque.push("Tom");
        arrayDeque.push("Jerry");
        System.out.println("ArrayDeque as Stack: " + arrayDeque);  // Output: [Jerry, Tom, Jane, Jack]
        System.out.println("Pop: " + arrayDeque.pop());  // Removes Jerry (LIFO)
        System.out.println("ArrayDeque after pop: " + arrayDeque);  // Output: [Tom, Jane, Jack]
    }
}
