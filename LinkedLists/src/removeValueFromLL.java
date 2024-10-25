public class removeValueFromLL {
    private static Node removeEl(Node head, int element){
        if(head == null) return head;

        if(head.data == element){
            head = head.next;
            return head;
        }
        Node temp = head;
        Node prev = null;
        while(temp != null){
            if(temp.data == element){
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        return  head;
    }
    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 7};
        Node head = new Node(arr[0]);
        head.next = new Node(arr[1]);
        head.next.next = new Node(arr[2]);
        head.next.next.next = new Node(arr[3]);
        head = removeEl(head,7);
        insertionInaLL.printLL(head);
    }
}
