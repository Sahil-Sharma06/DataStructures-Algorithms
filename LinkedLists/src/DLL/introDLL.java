package DLL;

import java.util.Scanner;

class Node{
    int data;
    Node next;
    Node back;

    Node(int data,Node next, Node back){
        this.data = data;
        this.next = next;
        this.back = back;
    }

    Node(int data){
        this.data = data;
        this.next = null;
        this.back = null;
    }
}
public class introDLL {

    private static Node convertArrayToDLL(int[] arr){
        int n = arr.length;
        Node head = new Node(arr[0]);
        Node prev = head;
        for(int i = 1 ; i <= n-1 ; i++){
            Node temp = new Node(arr[i],null,prev);
            prev.next = temp;
            prev = temp;
        }
        return head;
    }

    private static void printLL(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }

        Node head = convertArrayToDLL(arr);
        printLL(head);

    }
}
