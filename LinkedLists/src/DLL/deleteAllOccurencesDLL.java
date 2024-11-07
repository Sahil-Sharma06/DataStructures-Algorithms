package DLL;

public class deleteAllOccurencesDLL {

    static Node deleteOccurencesOfKey(Node head, int key){
        Node temp = head;

        while(temp != null){
            if(temp.data == key){
                if(temp == head){
                    head = temp.next;
                }

                Node nextNode = temp.next;
                Node prevNode = temp.back;

                if(nextNode != null) nextNode.back = prevNode;
                if(prevNode != null) prevNode.back = nextNode;

                temp = nextNode;
            }else{
                temp = temp.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {

    }
}
