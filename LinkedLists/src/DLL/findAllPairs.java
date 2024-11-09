package DLL;
import java.util.ArrayList;

class NodeDemo {
    int data;
    NodeDemo next, prev;

    NodeDemo(int data) {
        this.data = data;
        this.next = this.prev = null;
    }
}

public class findAllPairs {
    Node head;

    static ArrayList<ArrayList<Integer>> findPairsBruteForce(Node head, int sum) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        Node temp1 = head;
        while (temp1 != null) {
            Node temp2 = temp1.next;
            while (temp2 != null) {
                if (temp1.data + temp2.data == sum) {
                    ArrayList<Integer> pair = new ArrayList<>();
                    pair.add(temp1.data);
                    pair.add(temp2.data);
                    result.add(pair);
                }
                temp2 = temp2.next;
            }
            temp1 = temp1.next;
        }
        return result;
    }

    static Node findTail(Node head) {
        Node tail = head;
        while (tail != null && tail.next != null) {
            tail = tail.next;
        }
        return tail;
    }

    static ArrayList<ArrayList<Integer>> findPairsOptimal(Node head, int sum) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        Node left = head;
        Node right = findTail(head);
        while (left != null && right != null && left != right && left.back != right) {
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
        Node node3 = new Node(3);
        Node node4 = new Node(7);
        Node node5 = new Node(5);

        node1.next = node2;
        node2.back = node1;
        node2.next = node3;
        node3.back = node2;
        node3.next = node4;
        node4.back = node3;
        node4.next = node5;
        node5.back = node4;

        int targetSum = 10;

        ArrayList<ArrayList<Integer>> pairsBruteForce = findPairsBruteForce(node1, targetSum);
        System.out.println("Brute-force pairs with sum " + targetSum + ": " + pairsBruteForce);

        ArrayList<ArrayList<Integer>> pairsOptimal = findPairsOptimal(node1, targetSum);
        System.out.println("Optimal pairs with sum " + targetSum + ": " + pairsOptimal);
    }
}
