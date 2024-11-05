public class middleOfLL {

//    Bruteforce Approach
    static Node middleOfLLBrute(Node head){
        int count = 0;
        Node temp = head;
        while(temp != null){
            count++;
            temp = temp.next;
        }

        int middleNode = (count/2)+1;

        temp = head;
        for(int i = 1 ; i < middleNode ; i++){
            temp = temp.next;
        }

        return temp;
    }

    static Node middleOfLLOptimal(Node head){
        Node slow = head;
        Node fast = head;
        Node temp = head;

       while(fast != null && fast.next != null){
           slow = slow.next;
           fast = fast.next.next;
       }

       return slow;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(8);

        Node middle = middleOfLLOptimal(head);
        System.out.println("The middle node value is: " + (middle != null ? middle.data : "null"));
    }
}
