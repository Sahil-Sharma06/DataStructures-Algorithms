public class removeKthElementOfLL {
    private static Node removeK(Node head, int k){
        if(head == null) return head;

        if(k == 1){
            head = head.next;
            return head;
        }

        Node temp = head;
        Node prev = null;
        int count = 0;
        while(temp != null){
            count++;
            if(count == k){
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }
    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 7};
        Node head = new Node(arr[0]);
        head.next = new Node(arr[1]);
        head.next.next = new Node(arr[2]);
        head.next.next.next = new Node(arr[3]);
        head = removeK(head,4);
        insertionInaLL.printLL(head);
    }
}
