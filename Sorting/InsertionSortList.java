class ListNode{
    int val;
    ListNode next;

    ListNode(){}
    ListNode(int val) {
        this.val = val;
    }
    ListNode(int val, ListNode next){
        this.val = val;
        this.next = next;
    }
}
public class InsertionSortList {
    public static void main(String[] args) {
        ListNode head = new ListNode(5);
        head.next = new ListNode(3);
        head.next.next = new ListNode(4);
        head.next.next.next = new ListNode(1);
        head.next.next.next.next = new ListNode(2);

        System.out.println("Original List = ");
        printList(head);
        System.out.println("Sorted List = ");
        printList(insertionSortList(head));
    }

    public static ListNode insertionSortList(ListNode head){

        if(head == null || head.next == null){
            return head;
        }

        ListNode dummy = new ListNode(0);
        ListNode curr = head;

        while(curr != null){
            ListNode nextNode = curr.next;
            ListNode prev = dummy;

            while(prev.next != null && prev.next.val < curr.val){
                prev = prev.next;
            }

            curr.next = prev.next;
            prev.next = curr;

            curr = nextNode;
        }

        return dummy.next;
    }

    public static void printList(ListNode head){
        ListNode temp = head;
        while(temp != null){
            System.err.print(temp.val + (temp.next != null ? " -> " : ""));
            temp = temp.next;
        }

        System.out.println();
    }
}