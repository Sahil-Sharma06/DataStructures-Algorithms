package DLL;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class reverseADLL {

    static Node reverseDLL(Node head) {
        if (head == null || head.next == null) return head;
        Node temp = head;
        Stack<Integer> st = new Stack<>();

        while (temp != null) {
            st.push(temp.data);
            temp = temp.next;
        }

        temp = head;
        while (temp != null) {
            temp.data = st.peek();
            st.pop();
            temp = temp.next;
        }

        return head;
    }

    static Node reverseDLLOptimised(Node head) {
        if (head == null || head.next == null) return head;

        Node prev = null;
        Node curr = head;

        while (curr != null) {
            prev = curr.back;
            curr.back = curr.next;
            curr.next = prev;
            prev = curr;
            curr = curr.back;
        }

        if (prev != null) {
            head = prev;
        }

        return head;
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
        head = reverseDLLOptimised(head);
        introDLL.printLL(head);
    }

    public static class findAllPairs {

    //    Bruteforce approach
        static ArrayList<ArrayList<Integer>> findPairs(Node head, int sum) {
            Node temp1 = head;
            ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

            while (temp1 != null) {
                Node temp2 = temp1.next;
                while (temp2 != null) {
                    if (temp1.data + temp2.data == sum) {
                        ArrayList<Integer> pair = new ArrayList<>();
                        pair.add(temp1.data);
                        pair.add(temp2.data);
                        ans.add(pair);
                    }
                    temp2 = temp2.next;
                }
                temp1 = temp1.next;
            }

            return ans;
        }

    //    Optimal Approach

        // Function to find the tail (last node) of the doubly linked list
        static Node findTail(Node head) {
            Node tail = head;
            while (tail != null && tail.next != null) {
                tail = tail.next;
            }
            return tail;
        }


        static ArrayList<ArrayList<Integer>> findPairsWithSum(Node head, int sum) {
            ArrayList<ArrayList<Integer>> result = new ArrayList<>();
            Node left = head;
            Node right = findTail(head);

            // Two-pointer loop
            while (left != null && right != null && left != right && left.next != right) {
                int currentSum = left.data + right.data;
                if (currentSum == sum) {
                    ArrayList<Integer> pair = new ArrayList<>();
                    pair.add(left.data);
                    pair.add(right.data);
                    result.add(pair);
                    left = left.next;
                    right = right.back;
                } else if (currentSum < sum) {
                    left = left.next;
                } else {
                    right = right.back;
                }
            }

            return result;
        }

        public static void main(String[] args) {
            Node node1 = new Node(1);
            Node node2 = new Node(9);
            node1.next = node2;
            Node node3 = new Node(3);
            node2.next = node3;
            Node node4 = new Node(4);
            node3.next = node4;
            Node node5 = new Node(5);
            int targetSum = 10;

            // Find pairs with the target sum
            ArrayList<ArrayList<Integer>> pairs = findPairs(node1, targetSum);

            // Print the pairs
            System.out.println("Pairs with sum " + targetSum + ": " + pairs);
        }
    }
}
