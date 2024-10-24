public class lengthOfLL {
    private static int lengthofaLL(Node head){
        int cnt=0;
        Node temp=head;
        while(temp!=null){
            temp = temp.next;
            cnt++;
        }
        return cnt;
    }
    public static void main(String[] args) {
        int[]arr={2,5,8,7};
        Node head = new Node(arr[0]);
        head.next= new Node(arr[1]);
        head.next.next= new Node(arr[2]);
        head.next.next.next= new Node(arr[3]);
        System.out.println(lengthofaLL(head));
    }
}
