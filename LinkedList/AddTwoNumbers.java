class ListNode{
    int val;
    ListNode next;
    ListNode(){}

    ListNode(int val){
        this.val = val;
    }
    ListNode(int val, ListNode next) { 
        this.val = val; this.next = next; 
    }
}

public class AddTwoNumbers {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(2);
        node1.next = new ListNode(4);
        node1.next.next = new ListNode(3);

        ListNode node2 = new ListNode(5);
        node2.next = new ListNode(6);
        node2.next.next = new ListNode(4);

        ListNode resultList = addTwoNumbers(node1, node2);
        printList(resultList);
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2){
        
        ListNode ans = new ListNode(-1), head = ans;
        int carry = 0;

        while(l1 != null || l2 != null){
            int sum = carry;

            if(l1 != null){
                sum += l1.val;
                l1 = l1.next;
            }

            if(l2 != null){
                sum += l2.val;
                l2 = l2.next;
            }

            head.next = new ListNode(sum % 10);
            head = head.next;
            carry = sum / 10;
        }

        if(carry != 0){
            head.next = new ListNode(carry,null);
        }
        
        return ans.next;
    }

    public static void printList(ListNode head){
        ListNode curr = head;

        while(curr != null){
            System.out.print(curr.val);
            if(curr.next != null){
                System.out.print(" -> ");
            }
            curr = curr.next;
        }
    }
}
