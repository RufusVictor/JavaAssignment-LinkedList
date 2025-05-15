import java.util.LinkedList;
import java.util.Queue;
public class LinkedListQueue {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Alice");
        queue.add("Bob");
        queue.add("Charlie");
        queue.add("Diana");
        queue.poll();
        queue.poll();
        System.out.println("Remaining in queue: " + queue);
    }
}
