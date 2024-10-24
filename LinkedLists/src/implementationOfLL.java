
class Node{
    int data;
    Node next;
    Node(int data, Node next){
        this.data = data;
        this.next = next;
    }

    Node(int data){
        this.data = data;
        this.next = null;
    }

}
public class implementationOfLL {
    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 7};
        Node y = new Node(arr[0]);
        System.out.println("The data of the node is : "+y.data);
        Node x = y;
        System.out.println("The address of y is : " + x);
    }
}
