

/*
 876. Middle of the Linked List
        Easy
        9.8K
        288
        Companies
        Given the head of a singly linked list, return the middle ListNode of the linked list.

        If there are two middle ListNodes, return the second middle ListNode.

        

        Example 1:
        Input: head = [1,2,3,4,5]
        Output: [3,4,5]
        Explanation: The middle ListNode of the list is ListNode 3.


        Example 2:
        Input: head = [1,2,3,4,5,6]
        Output: [4,5,6]
        Explanation: Since the list has two middle ListNodes with values 3 and 4, we return the second one.

 */




package LinkedList.DoublyLinkedList.Easy;


class ListNode {

    int data;
    ListNode  next;
    ListNode  prev;
    ListNode(int x) {
        data = x;
        next = null;
        prev = null;
    }
} 


public class MiddleOFlinkedList {

    static ListNode insertAtTail(ListNode head, int data) {

        ListNode  newListNode = new ListNode(data);
        if (head == null) {
            head = newListNode;
            return head;
        }
        ListNode ListNode = head;
        while (ListNode . next != null) {
            ListNode = ListNode . next;
        }
        ListNode . next = newListNode;
        newListNode . prev = ListNode;
        return head;
    }

    static void display(ListNode head){
        ListNode ListNode = head;
  
        while(ListNode!=null){

            System.out.print(ListNode.data+" -->");
            ListNode = ListNode.next;
        }

    }

    static ListNode middleListNode(ListNode head) {

        ListNode node = head;
        int count = 0;
        while(node!=null){
            count++;
            node = node.next;
        }

        int pos = count/2+1;


        int count1 = 1;
        ListNode node1 = head;
        while(node1!=null){

            if(count1 == pos){
                break;
            }
            count1++;
            node1 = node1.next;
        }

        return node1;
    }

    public static void main(String[] args) {

        ListNode head = null;
        head = insertAtTail(head, 10);
        head = insertAtTail(head, 20);
        head = insertAtTail(head, 30);
        head = insertAtTail(head, 40);
        head = insertAtTail(head, 50);

        display(head);

        ListNode head1 = middleListNode(head);
        display(head1);

    }
}

