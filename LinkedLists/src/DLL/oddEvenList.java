package DLL;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class oddEvenList {
    static Node oddEvenLinkedList(Node head){
        Node temp = head;
        List<Integer> arr = new ArrayList<>();
        while(temp != null && temp.next != null){
            arr.add(temp.data);
            temp = temp.next.next;
        }
        if(temp != null) arr.add(temp.data);

        temp = head.next;

        while(temp != null && temp.next != null){
            arr.add(temp.data);
            temp = temp.next.next;
        }
        if(temp != null) arr.add(temp.data);

        int i = 0;
        temp = head;
        while(temp!= null){
            arr.add(temp.data);
            i++;
            temp = temp.next;
        }
        return head;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements in the linked list:");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("The list must contain at least one element.");
            return;
        }

        int[] arr = new int[n];
        System.out.println("Enter the elements of the linked list:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Node head = introDLL.convertArrayToDLL(arr);

        System.out.println("Original Linked List:");
        introDLL.printLL(head);

        head = oddEvenLinkedList(head);

        System.out.println("Transformed Linked List (Odd-Even arrangement):");
        introDLL.printLL(head);
    }
}
