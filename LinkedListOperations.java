import java.util.LinkedList;
public class LinkedListOperations {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }
        list.remove(2);
        list.removeLast();
        System.out.println("List after removals: " + list);
    }
}
