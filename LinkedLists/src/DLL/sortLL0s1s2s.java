package DLL;

import java.util.Scanner;

public class sortLL0s1s2s {

    static Node sortLL(Node head) {
        Node temp = head;
        int count0 = 0, count1 = 0, count2 = 0;

        while (temp != null) {
            if (temp.data == 0)
                count0++;
            else if (temp.data == 1)
                count1++;
            else
                count2++;
            temp = temp.next;
        }

        temp = head;

        while (temp != null) {
            if (count0 != 0) {
                temp.data = 0;
                count0--;
            } else if (count1 != 0) {
                temp.data = 1;
                count1--;
            } else {
                temp.data = 2;
                count2--;
            }
            temp = temp.next;
        }

        return head;
    }

    static Node createListFromInput(int n, Scanner scanner) {
        if (n <= 0) return null;

        System.out.print("Enter element 1 (0, 1, or 2): ");
        int data = scanner.nextInt();
        Node head = new Node(data);
        Node current = head;

        for (int i = 2; i <= n; i++) {
            System.out.print("Enter element " + i + " (0, 1, or 2): ");
            data = scanner.nextInt();
            current.next = new Node(data);
            current = current.next;
        }

        return head;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the linked list: ");
        int n = scanner.nextInt();

        System.out.println("Enter elements (0, 1, or 2 only):");
        Node head = createListFromInput(n, scanner);

        System.out.println("Original list:");
        introDLL.printLL(head);

        head = sortLL(head);

        System.out.println("Sorted list:");
        introDLL.printLL(head);

        scanner.close();
    }
}
