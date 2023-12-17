

/*
 206. Reverse Linked List
        Easy
        18.5K
        342
        Companies
        Given the head of a singly linked list, reverse the list, and return the reversed list.

        
        Example 1:
        Input: head = [1,2,3,4,5]
        Output: [5,4,3,2,1]

        
        Example 2:
        Input: head = [1,2]
        Output: [2,1]


        Example 3:
        Input: head = []
        Output: []

 */




package LinkedList.SinglyLinkedList.Easy;

class ListNode{
    int data;
    ListNode next;

    ListNode(int x){
        data = x;
        next = null;
    }
}

public class reverseLinkedList {

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

    static ListNode reverseList(ListNode head) {

        if(head==null){
            return head;
        }
        
        ListNode node = head;
        ListNode prev = null;

        while(node.next!=null){
            ListNode temp = node.next;
            node.next = prev;
            prev = node;
            node = temp;
        }

        node.next = prev;
        head = node;
        return head;
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

