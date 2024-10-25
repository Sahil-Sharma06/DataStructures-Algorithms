public class deletionOfHeadInLL {

    private static Node removeHead(Node head){
        if(head == null) return head;
        head = head.next;
        return head;
    }

    private static void printLL(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 7};
        Node head = new Node(arr[0]);
        head.next = new Node(arr[1]);
        head.next.next = new Node(arr[2]);
        head.next.next.next = new Node(arr[3]);
        head = removeHead(head);
        printLL(head);
    }
}
