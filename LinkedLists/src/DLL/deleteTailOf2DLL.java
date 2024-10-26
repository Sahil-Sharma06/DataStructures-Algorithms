package DLL;

import java.util.Scanner;

public class deleteTailOf2DLL {
     static Node removeTail(Node head){
        if(head == null || head.next == null) return  null;
        Node tail = head;
        while(tail.next != null){
            tail = tail.next;
        }

        Node prev = tail.back;
        prev.next = null;
        tail.back = null;

        return head;
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



        Node DLL = introDLL.convertArrayToDLL(arr);
        Node head = removeTail(DLL);
        introDLL.printLL(head);
    }
}
