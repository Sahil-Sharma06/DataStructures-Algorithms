public class searchInaLL {
    public static int checkifPresent(Node head, int desiredElement) {
        Node temp = head;

        while (temp != null) {
            if (temp.data == desiredElement)
                return 1;

            temp = temp.next;
        }

        return 0;
    }

    // Main function
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        Node head = new Node(arr[0]);
        head.next = new Node(arr[1]);
        head.next.next = new Node(arr[2]);

        int val = 3;
        System.out.print(checkifPresent(head, val));
    }
}
