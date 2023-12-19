
/*

203. Remove Linked List Elements
        Easy
        8K
        224
        Companies
        Given the head of a linked list and an integer val, remove all the nodes of the linked list that has Node.val == val, and return the new head.

        

        Example 1:
        Input: head = [1,2,6,3,4,5,6], val = 6
        Output: [1,2,3,4,5].

        Example 2:
        Input: head = [], val = 1
        Output: [].

        Example 3:
        Input: head = [7,7,7,7], val = 7
        Output: [].

 */



package LinkedList.SinglyLinkedList.Easy;

class ListNode{
    int val;
    ListNode next;

    ListNode(int x){
        val = x;
        next = null;
    }
}


class RemoveLinkedListElements{
    static ListNode removeElements(ListNode head, int val) {

        if(head == null){
            return head;
        }

        while(head!=null && head.val == val){
            head = head.next;
        }

        if(head == null){
            return head;
        }

        ListNode curr = head;
        ListNode prev = null;

        while(curr!=null){
            if(curr.val == val){
                if(curr.next!=null)
                    prev.next = curr.next;

                else{
                    prev.next = null;
                    break;
                }
                // prev = prev;
                curr = curr.next;
            }
            else{

                prev = curr;
                curr = curr.next;
            }
        }

        return head;

    }

    public static void main(String[] args) {
        
    }
}

