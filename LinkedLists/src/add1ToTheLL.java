public class add1ToTheLL {

    public static Node addOneIterative(Node head) {
        head = reverse(head);
        Node temp = head;
        int carry = 1;

        while (temp != null) {
            int sum = temp.data + carry;
            temp.data = sum % 10;
            carry = sum / 10;

            if (carry == 0) {
                break;
            }
            if (temp.next == null && carry != 0) {
                temp.next = new Node(carry);
                carry = 0;
            }
            temp = temp.next;
        }

        return reverse(head);
    }

    private static Node reverse(Node head) {
        Node prev = null;
        Node curr = head;

        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    private static int addHelper(Node temp) {
        if (temp == null) {
            return 1;
        }

        int carry = addHelper(temp.next);
        temp.data += carry;

        if (temp.data < 10) {
            return 0;
        }

        temp.data = 0;
        return 1;
    }

    public static Node addOne(Node head) {
        int carry = addHelper(head);

        if (carry == 1) {
            Node newNode = new Node(1);
            newNode.next = head;
            head = newNode;
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

    public static void main(String[] args) {
        Node head = new Node(9);
        head.next = new Node(9);
        head.next.next = new Node(9);

        System.out.print("Original List: ");
        printLinkedList(head);

        Node resultIterative = addOne(head);
        System.out.print("After adding 1 (Recursive): ");
        printLinkedList(resultIterative);
    }
}
