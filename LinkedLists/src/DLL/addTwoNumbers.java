package DLL;

import java.util.Scanner;

public class addTwoNumbers {

    static Node addTwoNumbers(Node head1, Node head2) {
        Node dummyNode = new Node(-1);
        Node curr = dummyNode;
        Node temp1 = head1;
        Node temp2 = head2;
        int carry = 0;

        while (temp1 != null || temp2 != null) {
            int sum = carry;
            if (temp1 != null) sum += temp1.data;
            if (temp2 != null) sum += temp2.data;

            Node newNode = new Node(sum % 10);
            carry = sum / 10;
            curr.next = newNode;
            curr = curr.next;

            if (temp1 != null) temp1 = temp1.next;
            if (temp2 != null) temp2 = temp2.next;
        }

        if (carry != 0) {
            Node newNode = new Node(carry);
            curr.next = newNode;
        }

        return dummyNode.next;
    }

    // Method to print the linked list
    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for the first linked list
        System.out.println("Enter the number of elements for the first linked list:");
        int n1 = sc.nextInt();
        System.out.println("Enter the elements of the first linked list:");
        Node head1 = null, tail1 = null;
        for (int i = 0; i < n1; i++) {
            int data = sc.nextInt();
            Node newNode = new Node(data);
            if (head1 == null) {
                head1 = newNode;
                tail1 = newNode;
            } else {
                tail1.next = newNode;
                tail1 = tail1.next;
            }
        }

        // Input for the second linked list
        System.out.println("Enter the number of elements for the second linked list:");
        int n2 = sc.nextInt();
        System.out.println("Enter the elements of the second linked list:");
        Node head2 = null, tail2 = null;
        for (int i = 0; i < n2; i++) {
            int data = sc.nextInt();
            Node newNode = new Node(data);
            if (head2 == null) {
                head2 = newNode;
                tail2 = newNode;
            } else {
                tail2.next = newNode;
                tail2 = tail2.next;
            }
        }

        // Adding the two numbers represented by the linked lists
        Node result = addTwoNumbers(head1, head2);

        // Printing the result
        System.out.println("The resulting linked list after addition is:");
        printList(result);

        sc.close();
    }
}
