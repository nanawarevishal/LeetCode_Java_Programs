

/*
 148. Sort List
        Medium
        10.1K
        294
        Companies
        Given the head of a linked list, return the list after sorting it in ascending order.

        

        Example 1:
        Input: head = [4,2,1,3]
        Output: [1,2,3,4]


        Example 2:
        Input: head = [-1,5,3,4,0]
        Output: [-1,0,3,4,5]


        Example 3:
        Input: head = []
        Output: []

 */





package LinkedList.SinglyLinkedList.Medium;


class ListNode{
    int val;
    ListNode next;

    ListNode(int x){
        val = x;
        next = null;
    }
}
public class sortLinkedList {

    static ListNode insert(ListNode head,int val){

        ListNode node = head;
        ListNode newnode = new ListNode(val);
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
                System.out.print(node.val+"-->");
                node = node.next;
            }
        }
    }

    static ListNode sortList(ListNode head) {

        ListNode node1 = head;
        
        while(node1!=null){
            ListNode node2 = node1.next;
            while(node2!=null){
                if(node1.val > node2.val){
                    int temp = node1.val;
                    node1.val = node2.val;
                    node2.val= temp;
                }
                node2=node2.next;
            }

            node1 = node1.next;
        }
        return head;
    }   

 
    public static void main(String[] args) {
        ListNode head = null;
        display(head);

        head = insert(head, 20);
        head = insert(head, 40);
        head = insert(head, 10);
        head = insert(head, 30);

        System.out.println("The linked list before sorting....!");
        display(head);

        System.out.println("\nLinked-List after sorting..!");
        head = sortList(head);

        display(head);

    }
}

