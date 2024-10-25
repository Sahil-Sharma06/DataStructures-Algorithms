public class insertionAtHead {
    private static Node insertHead(Node head, int val){
        return new Node(val,head);
    }
    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 7};
        Node head = new Node(arr[0]);
        head.next = new Node(arr[1]);
        head.next.next = new Node(arr[2]);
        head.next.next.next = new Node(arr[3]);
        head = insertHead(head,7);
        insertionInaLL.printLL(head);
    }
}
