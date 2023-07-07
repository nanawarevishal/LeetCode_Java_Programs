

/*

 61. Rotate List
        Medium
        8.1K
        1.4K
        Companies
        Given the head of a linked list, rotate the list to the right by k places.

        

        Example 1:
        Input: head = [1,2,3,4,5], k = 2
        Output: [4,5,1,2,3]


        Example 2:
        Input: head = [0,1,2], k = 4
        Output: [2,0,1]


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
public class RotateLinkedListToRight {

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


    static ListNode rotateRight(ListNode head, int k) {

        if(head==null || head.next==null){
            return head; 
        }

        ListNode temp = head;
        int count=0;

        while(temp!=null){
            count++;
            temp = temp.next;
        }

        int itr = k%count;

        for(int i=1;i<=itr;i++){

            ListNode node = head;
            ListNode prevNode = null;
            while(node.next!=null){
                prevNode = node;
                node = node.next;
            }
            prevNode.next =null;
            node.next = head;
            head = node;
        }
        return head;
    }


    public static void main(String[] args) {
        ListNode head = null;
        display(head);

        head = insert(head, 0);
        head = insert(head, 1);
        head = insert(head, 2);
        // head= insert(head, 3);
        // head = insert(head, 4);
        // head = insert(head, 5);

        System.out.println("\nLinked List before reversal by K places...!");
        display(head);

        System.out.println("\nLinked List after reversal By K places...!");
        head = rotateRight(head, 4);
        display(head);





    }
}

