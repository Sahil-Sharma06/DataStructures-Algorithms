package DLL;

import java.util.Scanner;

public class deleteNodeIn2DLL {
    static void deleteNode(Node temp){
        Node prev = temp.back;
        Node front = temp.next;

        if(front == null){
            temp.back = null;
            prev.back = null;
            return;
        }
        prev.next = front;
        front.back = prev;
        temp.next = temp.back = null;
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



        Node head = introDLL.convertArrayToDLL(arr);
        deleteNode(head.next);
        introDLL.printLL(head);
    }
}
