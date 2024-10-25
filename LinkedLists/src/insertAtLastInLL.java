public class insertAtLastInLL {
    private static Node insertLast(Node head, int val){
        if(head == null)
            return new Node(val);

        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        Node newNode = new Node(val);
        temp.next = newNode;
        return head;
    }
    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 7};
        Node head = new Node(arr[0]);
        head.next = new Node(arr[1]);
        head.next.next = new Node(arr[2]);
        head.next.next.next = new Node(arr[3]);
        head = insertLast(head,12);
        head = insertLast(head,342);
        insertionInaLL.printLL(head);
    }
}
