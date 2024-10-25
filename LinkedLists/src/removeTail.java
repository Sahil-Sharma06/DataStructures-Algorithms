public class removeTail {
    private static Node removeTail(Node head){
        if(head == null || head.next == null)
            return null;

        Node temp = head;
        while(temp.next.next != null)
            temp = temp.next;

        temp.next = null;
        return head;
    }
    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 7};
        Node head = new Node(arr[0]);
        head.next = new Node(arr[1]);
        head.next.next = new Node(arr[2]);
        head.next.next.next = new Node(arr[3]);
        head = removeTail(head);
        insertionInaLL.printLL(head);
    }
}
