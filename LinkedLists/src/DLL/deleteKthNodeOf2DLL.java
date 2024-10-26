package DLL;

import java.util.Scanner;

public class deleteKthNodeOf2DLL {
    static Node removeKthNode(Node head, int k){
        Node temp = head;
        int count = 0;
        while(temp != null){
            count++;
            if(count == k) break;
            temp = temp.next;
        }
        Node prev = temp.back;
        Node front = temp.next;
        if(prev == null && front == null)
            return null;
        else if(prev == null){
            return deleteHeadOf2DLL.removeHead(head);
        }else if(front == null){
            return deleteTailOf2DLL.removeTail(head);
        }else{
            prev.next = front;
            front.back = prev;
            temp.next = null;
            temp.back = null;
        }

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
        Node head = removeKthNode(DLL,4);
        introDLL.printLL(head);
    }
}
