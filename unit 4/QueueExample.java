
// package unit 4;
import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("First");
        queue.add("Second");
        queue.add("Third");

        System.out.println("Queue: " + queue); // Output: Queue: [First, Second, Third]

        String removedElement = queue.remove(); // remove front element
        System.out.println("Removed Element: " + removedElement); // Output: Removed Element: First
        System.out.println("Queue after removal: " + queue); // Output: Queue after removal: [Second, Third]

        String head = queue.peek();
        System.out.println("Head of the Queue: " + head); // Output: Head of the Queue: Second

        queue.offer("Fourth"); // add element to the end of the queue
        System.out.println("Queue after adding Fourth: " + queue); // Output: Queue after
    }
}
