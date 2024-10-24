import java.util.Arrays;
import java.util.List;

public class insertionInaLL {
    public static void printLL(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static Node insertHead(Node head, int val) {
        Node temp = new Node(val, head);
        return temp;
    }

    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(12, 8, 5, 7);
        int val = 200;

        Node head = new Node(arr.get(0));
        head.next = new Node(arr.get(1));
        head.next.next = new Node(arr.get(2));
        head.next.next.next = new Node(arr.get(3));
        head = insertHead(head, val);

        printLL(head);
    }
}
