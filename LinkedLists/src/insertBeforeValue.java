public class insertBeforeValue {
    public static Node insertBeforeValue(Node head, int targetValue, int newValue) {
        Node newNode = new Node(newValue);
        if (head == null) {
            return null;
        }

        if (head.data == targetValue) {
            newNode.next = head;
            return newNode;
        }

        Node current = head;
        while (current.next != null && current.next.data != targetValue) {
            current = current.next;
        }

        if (current.next != null) {
            newNode.next = current.next;
            current.next = newNode;
        } else {
            System.out.println("Target value not found in the list.");
        }

        return head;
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 7};
        Node head = new Node(arr[0]);
        head.next = new Node(arr[1]);
        head.next.next = new Node(arr[2]);
        head.next.next.next = new Node(arr[3]);
        head = insertBeforeValue(head,5,90);
        insertionInaLL.printLL(head);
    }
}
