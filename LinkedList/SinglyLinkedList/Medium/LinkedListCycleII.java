

/*
 142. Linked List Cycle II
        Medium
        12K
        864
        Companies
        Given the head of a linked list, return the node where the cycle begins. If there is no cycle, return null.

        There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer is connected to (0-indexed). It is -1 if there is no cycle. Note that pos is not passed as a parameter.

        Do not modify the linked list.

        

        Example 1:
        Input: head = [3,2,0,-4], pos = 1
        Output: tail connects to node index 1
        Explanation: There is a cycle in the linked list, where tail connects to the second node.

        Example 2:
        Input: head = [1,2], pos = 0
        Output: tail connects to node index 0
        Explanation: There is a cycle in the linked list, where tail connects to the first node.


        Example 3:
        Input: head = [1], pos = -1
        Output: no cycle
        Explanation: There is no cycle in the linked list.

 */




package LinkedList.SinglyLinkedList.Medium;


import java.util.Hashtable;

class ListNode{
    int data;
    ListNode next;
    public String val;

    ListNode(int x){
        data = x;
        next = null;
    }
}
public class LinkedListCycleII {

    static ListNode insert(ListNode head,int data){

        ListNode node = head;
        ListNode newnode = new ListNode(data);
        if(head==null){
            head = newnode;
            newnode.next=null;
        }

        else{

            while(node.next!=null){
                node = node.next;
            }

            node.next = newnode;
            newnode.next= null;
        }
        return head;
    }

    static void display(ListNode head){
        ListNode node = head;
        if(head == null){
            System.out.println("Lineked list is empty...!");
        }

        else{
            while(node!=null){
                System.out.print(node.data+"-->");
                node = node.next;
            }
        }
    }

    static void delete(ListNode node){
        node.data = node.next.data;
        node.next = node.next.next;
        
    }

    static ListNode detectCycleBruteForce(ListNode head) {

        Hashtable<Integer,ListNode> hm=new Hashtable<Integer,ListNode>();  
        ListNode node = head;

        int x = 1;
        while(node!=null){
            if(!hm.containsValue(node)){
                hm.put(x, node);
                x++;
            }
            else{
                return node;
            }
            node = node.next;
        }
        return null;
    }

    static ListNode detectCycleBetter(ListNode head) {
        if(head==null || head.next==null){
            return null;
        }

        ListNode fast = head;
        ListNode slow = head;

        while(fast.next!=null && fast.next.next!=null){
            fast = fast.next.next;
            slow = slow.next;

            if(fast == fast.next.next){
                return fast;
            }

            if(fast==slow){
                return fast.next;
            }
        }
        
        return null;
    }
    public static void main(String[] args) {
        ListNode head = null;
        display(head);

        head = insert(head, 10);
        head = insert(head, 20);
        head= insert(head, 30);
        head = insert(head, 40);

        System.out.println("\nLinked List after insertion...!");
        display(head);

        ListNode node = head;
        while(node.data!=30){
            node = node.next;
        }

        delete(node);

        System.out.println("\nLinked List after deletion of anonymous node...!");
        display(head);


    }
}
