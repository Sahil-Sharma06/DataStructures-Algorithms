import java.util.HashMap;
import java.util.Map;

public class lengthOfLoop {
    public static int lengthOfLoopBrute(Node head) {
        Map<Node, Integer> visitedNodes = new HashMap<>();
        Node temp = head;
        int timer = 0;
        while (temp != null) {
            if (visitedNodes.containsKey(temp)) {
                int loopLength = timer - visitedNodes.get(temp);
                return loopLength;
            }
            visitedNodes.put(temp, timer);
            temp = temp.next;
            timer++;
        }
        return 0;
    }

//    Optimal Approach

    static int findLength(Node slow, Node fast){
        int cnt = 1;
        fast = fast.next;
        while(slow!=fast){
            cnt++;
            fast = fast.next;
        }
        return cnt;
    }
    static int lengthOfLoopOptimal(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return findLength(slow, fast);
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);
        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = second;

        int loopLength = lengthOfLoopOptimal(head);

        if (loopLength > 0) {
            System.out.println("Length of the loop: " + loopLength);
        } else {
            System.out.println("No loop found in the linked list.");
        }
    }
}
