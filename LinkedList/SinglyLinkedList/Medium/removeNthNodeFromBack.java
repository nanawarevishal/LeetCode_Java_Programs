

/*
 19. Remove Nth Node From End of List
        Medium
        16.2K
        675
        Companies
        Given the head of a linked list, remove the nth node from the end of the list and return its head.

        

        Example 1:
        Input: head = [1,2,3,4,5], n = 2
        Output: [1,2,3,5]


        Example 2:
        Input: head = [1], n = 1
        Output: []

        Example 3:
        Input: head = [1,2], n = 1
        Output: [1]

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
public class removeNthNodeFromBack {

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


     static ListNode removeNthFromEnd(ListNode head, int n) {

        int count=0;
        ListNode node = head;

        while(node!=null){
            count++;
            node = node.next;
        }

        if(count==1){
            head=null;
            return head;
        }

        ListNode newnode = head;
        int count1=0;
        ListNode prevNode = null;
        while(newnode!=null){

            count1++;

            if(count1==count-n+1){

                if(count-n==0){
                    head = newnode.next;
                    return head;
                }
                else{

                    prevNode.next = newnode.next;
                    return head;
                }
            }
            prevNode = newnode;
            newnode = newnode.next;
            
        }
        return head;
    }


    public static void main(String[] args) {
        ListNode head = null;
        display(head);

        head = insert(head, 10);
        head = insert(head, 20);
        head = insert(head, 30);

        System.out.println("The linked list....!");
        display(head);

        System.out.println("\nLinked list after removing Nth node from back..!\n");
        head = removeNthFromEnd(head, 3);

        display(head);

    }
}

   

   