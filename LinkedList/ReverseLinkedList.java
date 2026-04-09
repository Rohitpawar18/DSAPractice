class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class ReverseLinkedList {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        printList(head);
        Node  reverseList = reverseList(head);
        printList(reverseList);
    }

    public static Node reverseList(Node head){
        
        Node prev = null;
        Node curr = head;
        Node temp = null;

        while(curr != null){

            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;

        }
        return prev;
    }

    public static void printList(Node head){
        Node curr = head;
        while(curr != null){
            System.out.print(curr.data);
            if(curr.next != null){
                System.out.print(" -> ");
            }
            curr = curr.next;
        }
        System.out.println();
    }
}
