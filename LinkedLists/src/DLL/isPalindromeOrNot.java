package DLL;

import java.util.Stack;

public class isPalindromeOrNot {
    public static boolean isPalindromeBrute(Node head){
        Node temp = head;
        Stack<Integer> st = new Stack<>();

        while(temp != null){
            st.push(temp.data);
            temp = temp.next;
        }

        temp = head;
        while(temp != null){
            if(temp.data != st.peek()){
                return false;
            }
            st.pop();
            temp = temp.next;
        }
        return true;
    }

    public static boolean isPalindromeOptimal(Node head){

        if(head == null || head.next == null) return true;
        Node slow = head;
        Node fast = head;

        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        Node newHead = reverseLL.reverseLLRecursion(slow.next);
        Node first = head;
        Node second = newHead;

        while(second != null){
            if(first.data != second.data){
                reverseLL.reverseLLRecursion(newHead);
                return false;
            }

            first = first.next;
            second = second.next;
        }

        reverseLL.reverseLLRecursion(newHead);
        return true;
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(2);
        head.next.next.next = new Node(1);

        System.out.println("Is Palindrome: " + isPalindromeOptimal(head));
    }
}
