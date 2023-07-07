

/*
 25. Reverse Nodes in k-Group
        Hard
        11.7K
        590
        Companies
        Given the head of a linked list, reverse the nodes of the list k at a time, and return the modified list.

        k is a positive integer and is less than or equal to the length of the linked list. If the number of nodes is not a multiple of k then left-out nodes, in the end, should remain as it is.

        You may not alter the values in the list's nodes, only nodes themselves may be changed.

        
        Example 1:
        Input: head = [1,2,3,4,5], k = 2
        Output: [2,1,4,3,5]


        Example 2:
        Input: head = [1,2,3,4,5], k = 3
        Output: [3,2,1,4,5]


 */



package LinkedList.SinglyLinkedList.Hard;


class ListNode{
    int val;
    ListNode next;

    ListNode(int x){
        val = x;
        next = null;
    }
}

public class reverseNodeInKGroup {

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
    static ListNode reverseKGroup(ListNode head, int k) {

        if(head==null){
            return head;
        }
        
        ListNode temp = head;
        int count =0;
        while(temp!=null){
            count++;
            temp= temp.next;
        }

        ListNode dNode = new ListNode(0);
        dNode.next =head;
        ListNode prevNode = dNode;

        ListNode currNode,nextNode;

        while(count>=k){
            currNode = prevNode.next;
            nextNode = currNode.next;

            for(int i=1;i<k;i++){
                currNode.next = nextNode.next;
                nextNode.next = prevNode.next;
                prevNode.next = nextNode;
                nextNode = currNode.next;
            }
            prevNode = currNode;
            count -=k;
        }
        return dNode.next;
    }
    public static void main(String[] args) {
        ListNode head = null;
        display(head);

        head = insert(head, 1);
        head = insert(head, 2);
        head = insert(head, 3);
        head = insert(head, 4);
        head = insert(head,5);
        head = insert(head, 6);
        head = insert(head, 7);
        head = insert(head, 8);
       

        System.out.println("\nLinked List before reversal of K group...!");
        display(head);

        System.out.println("\bLinked List after reversal of K Group");

        head = reverseKGroup(head, 3);

        display(head);

        // System.out.println(isPalindrome(head));

    }

}



