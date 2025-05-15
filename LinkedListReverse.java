import java.util.LinkedList;
import java.util.ListIterator;
public class LinkedListReverse {
    public static LinkedList<Character> reverseList(LinkedList<Character> list) {
        LinkedList<Character> reversed = new LinkedList<>();
        ListIterator<Character> iterator = list.listIterator(list.size());
        while (iterator.hasPrevious()) {
            reversed.add(iterator.previous());
        }
        return reversed;
    }
    public static void main(String[] args) {
        LinkedList<Character> list = new LinkedList<>();
        list.add('A');
        list.add('B');
        list.add('C');
        list.add('D');
        list.add('E');
        LinkedList<Character> reversed = reverseList(list);
        System.out.println("Reversed list: " + reversed);
    }
}
