package DLL;
import java.util.Stack;
public class reverseLL {
//        Bruteforce Approach
        public static Node reverseLinkedList(Node head) {
            Node temp = head;
            Stack<Integer> stack = new Stack<>();

            while (temp != null) {
                stack.push(temp.data);
                temp = temp.next;
            }

            temp = head;

            while (temp != null) {
                temp.data = stack.pop();
                temp = temp.next;
            }

            return head;
        }

        public static void printLinkedList(Node head) {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

//        Optimal Approach -> recursion

        public static Node reverseLLRecursion(Node head){
            if(head == null || head.next == null) return head;

            Node newHead = reverseLLRecursion(head.next);
            Node front = head.next;
            front.next = head;
            head.next = null;

            return newHead;
        }


        public static void main(String[] args) {
            Node head = new Node(1);
            head.next = new Node(3);
            head.next.next = new Node(2);
            head.next.next.next = new Node(4);

            System.out.print("Original Linked List: ");
            printLinkedList(head);

            head = reverseLLRecursion(head);

            System.out.print("Reversed Linked List: ");
            introDLL.printLL(head);
        }
}
