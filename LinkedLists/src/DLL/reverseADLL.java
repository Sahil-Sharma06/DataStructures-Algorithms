package DLL;

import java.util.Scanner;
import java.util.Stack;

public class reverseADLL {

    static Node reverseDLL(Node head) {
        if (head == null || head.next == null) return head;
        Node temp = head;
        Stack<Integer> st = new Stack<>();

        while (temp != null) {
            st.push(temp.data);
            temp = temp.next;
        }

        temp = head;
        while (temp != null) {
            temp.data = st.peek();
            st.pop();
            temp = temp.next;
        }

        return head;
    }

    static Node reverseDLLOptimised(Node head) {
        if (head == null || head.next == null) return head;

        Node prev = null;
        Node curr = head;

        while (curr != null) {
            prev = curr.back;
            curr.back = curr.next;
            curr.next = prev;
            prev = curr;
            curr = curr.back;
        }

        if (prev != null) {
            head = prev;
        }

        return head;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Node head = introDLL.convertArrayToDLL(arr);
        head = reverseDLLOptimised(head);
        introDLL.printLL(head);
    }
}
