

/*
 2095. Delete the Middle Node of a Linked List
        Medium
        3.2K
        57
        Companies
        You are given the head of a linked list. Delete the middle node, and return the head of the modified linked list.

        The middle node of a linked list of size n is the ⌊n / 2⌋th node from the start using 0-based indexing, where ⌊x⌋ denotes the largest integer less than or equal to x.

        For n = 1, 2, 3, 4, and 5, the middle nodes are 0, 1, 1, 2, and 2, respectively.
        

        Example 1:
        Input: head = [1,3,4,7,1,2,6]
        Output: [1,3,4,1,2,6]
        Explanation:
        The above figure represents the given linked list. The indices of the nodes are written below.
        Since n = 7, node 3 with value 7 is the middle node, which is marked in red.
        We return the new list after removing this node. 


        Example 2:
        Input: head = [1,2,3,4]
        Output: [1,2,4]
        Explanation:
        The above figure represents the given linked list.
        For n = 4, node 2 with value 3 is the middle node, which is marked in red.


        Example 3:
        Input: head = [2,1]
        Output: [2]
        Explanation:
        The above figure represents the given linked list.
        For n = 2, node 1 with value 1 is the middle node, which is marked in red.
        Node 0 with value 2 is the only node remaining after removing node 1.


 */



package LinkedList.SinglyLinkedList.Medium;


class ListNode{
    int data;
    ListNode next;

    ListNode(int x){
        data = x;
        next = null;
    }
}
public class deleteMiddleOfLinkedList {

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

    static ListNode deleteMiddle(ListNode head) {

        ListNode node = head;

        int count=0;
        
        while(node!=null){
            count++;
            node= node.next;
        }

        if(count==1){
            head=null;
            return head;
        }

        int pos = count/2;

        ListNode newNode = head;
        int count1=0;
        ListNode prevNode =null;
        while(newNode!=null){
            count1++;

            if(count1==pos+1){
                prevNode.next = newNode.next;
            }
            prevNode = newNode;
            newNode = newNode.next;
        }
        return head;
    }
     

    public static void main(String[] args) {
        ListNode head = null;
        display(head);

        head = insert(head, 10);
        // head = insert(head, 20);
        // head = insert(head, 30);
        // head = insert(head, 40);

        System.out.println("The linked list before deletion....!");
        display(head);

        System.out.println("\nLinked List after deletion..");
        head = deleteMiddle(head);
        display(head);

    }
}

   

   
