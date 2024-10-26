package DLL;

import java.util.Scanner;

public class insertionInA2DLL {
    static Node head;

    public static void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head.back = newNode;
            head = newNode;
        }
    }

    static void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.back = temp;
        }
    }

    public static void insertAtPosition(int data, int position) {
        Node newNode = new Node(data);
        if (position == 1) {
            insertAtBeginning(data);
            return;
        }

        Node temp = head;
        for (int i = 1; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Position out of bounds.");
            return;
        }

        newNode.next = temp.next;
        newNode.back = temp;

        if (temp.next != null) {
            temp.next.back = newNode;
        }
        temp.next = newNode;
    }

    public static void insertBeforePosition(int data, int position) {
        Node newNode = new Node(data);
        if (head == null) {
            if (position == 1) {
                head = newNode;
            } else {
                System.out.println("Position out of bounds.");
            }
            return;
        }

        if (position == 1) {
            newNode.next = head;
            head.back = newNode;
            head = newNode;
            return;
        }

        Node temp = head;
        for (int i = 1; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null || temp.next == null) {
            System.out.println("Position out of bounds.");
            return;
        }

        newNode.next = temp.next;
        newNode.back = temp;
        if (temp.next != null) {
            temp.next.back = newNode;
        }
        temp.next = newNode;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
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
        insertAtBeginning(12);
        insertAtEnd(23);
        insertAtPosition(56, 3);
        introDLL.printLL(head);
    }
}
