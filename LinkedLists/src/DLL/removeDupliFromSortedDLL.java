package DLL;
import java.util.Scanner;
public class removeDupliFromSortedDLL {

    static Node removeDupli(Node head){
        Node temp = head;

        while(temp != null && temp.next != null){
            Node nextNode = temp.next;
            while(nextNode != null && nextNode.data == temp.data){
                nextNode = nextNode.next;
            }
            temp.next = nextNode;
            nextNode.back = temp;

            temp = temp.next;
        }
        return head;
    }

    static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of nodes in the sorted doubly linked list:");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("The list cannot be empty.");
            return;
        }

        System.out.println("Enter the sorted values for the nodes:");
        int data = scanner.nextInt();
        Node head = new Node(data);
        Node current = head;

        for (int i = 1; i < n; i++) {
            data = scanner.nextInt();
            Node newNode = new Node(data);
            current.next = newNode;
            newNode.back = current;
            current = newNode;
        }

        System.out.println("Original list:");
        printList(head);
        head = removeDupli(head);

        System.out.println("List after removing duplicates:");
        printList(head);

        scanner.close();
    }
}
