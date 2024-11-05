import java.util.HashSet;
public class loopInLL {
    public static boolean hasLoop(Node head) {
        HashSet<Node> visitedNodes = new HashSet<>();

        Node current = head;
        while (current != null) {
            if (visitedNodes.contains(current)) {
                return true;
            }
            visitedNodes.add(current);
            current = current.next;
        }
        return false;
    }

//    Optimal Approach

    public static boolean hasLoopOptimal(Node head) {
        if (head == null || head.next == null) {
            return false;
        }

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }

        return false;
    }


    public static void main(String[] args) {
        // Example usage
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = head.next; // Creating a loop for testing

        if (hasLoopOptimal(head)) {
            System.out.println("The linked list contains a loop.");
        } else {
            System.out.println("The linked list does not contain a loop.");
        }
    }
}
