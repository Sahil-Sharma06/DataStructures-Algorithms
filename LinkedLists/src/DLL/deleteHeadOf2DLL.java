package DLL;

import java.util.Scanner;

public class deleteHeadOf2DLL {

    public deleteHeadOf2DLL(Node head) {
    }

    static Node removeHead(Node head){
        if(head == null || head.next == null)
            return  null;

        Node prev = head;
        head = head.next;
        prev.next = null;
        head.back = null;

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
        Node head = removeHead(DLL);
        introDLL.printLL(head);
    }
}
