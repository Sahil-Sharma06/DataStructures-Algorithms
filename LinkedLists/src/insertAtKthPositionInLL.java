public class insertAtKthPositionInLL {
    private static Node insertAtK(Node head, int k, int val){
        if(head == null || head.next == null)
            return null;

        if(k == 1){
            Node temp = head;
            Node newNode = new Node(val);
            newNode.next = temp;
            head = newNode;
            return head;
        }

        Node temp = head;
        Node next = null;
        int count = 0;
        while(temp.next != null){
            count++;
            if(count == k-1){
                Node newNode = new Node(val);
                temp.next = newNode;
                newNode.next = next;
            }
            next = temp.next.next;
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
        head = insertAtK(head,3,90);
        insertionInaLL.printLL(head);
    }
}
