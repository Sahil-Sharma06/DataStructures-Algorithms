import java.util.PriorityQueue;

public class mergeKSortedLists {
    public static Node mergeKLists(Node[] listArray) {
        PriorityQueue<Node> pq = new PriorityQueue<>((a, b) -> a.data - b.data);

        for (Node node : listArray) {
            if (node != null) {
                pq.offer(node);
            }
        }

        Node dummyNode = new Node(-1);
        Node temp = dummyNode;

        while (!pq.isEmpty()) {
            Node minNode = pq.poll();
            temp.next = minNode;
            temp = temp.next;

            if (minNode.next != null) {
                pq.offer(minNode.next);
            }
        }

        return dummyNode.next;
    }

    public static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node[] listArray = new Node[3];

        listArray[0] = new Node(1);
        listArray[0].next = new Node(4);
        listArray[0].next.next = new Node(5);

        listArray[1] = new Node(1);
        listArray[1].next = new Node(3);
        listArray[1].next.next = new Node(4);

        listArray[2] = new Node(2);
        listArray[2].next = new Node(6);

        Node result = mergeKLists(listArray);
        System.out.print("Merged List: ");
        printList(result);
    }
}
