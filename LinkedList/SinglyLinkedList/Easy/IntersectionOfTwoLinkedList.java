

/*
 160. Intersection of Two Linked Lists
        Easy
        13.3K
        1.2K
        Companies
        Given the heads of two singly linked-lists headA and headB, return the node at which the two lists intersect. If the two linked lists have no intersection at all, return null.

        For example, the following two linked lists begin to intersect at node c1:


        The test cases are generated such that there are no cycles anywhere in the entire linked structure.

        Note that the linked lists must retain their original structure after the function returns.

        Custom Judge:

        The inputs to the judge are given as follows (your program is not given these inputs):

        intersectVal - The value of the node where the intersection occurs. This is 0 if there is no intersected node.
        listA - The first linked list.
        listB - The second linked list.
        skipA - The number of nodes to skip ahead in listA (starting from the head) to get to the intersected node.
        skipB - The number of nodes to skip ahead in listB (starting from the head) to get to the intersected node.
        The judge will then create the linked structure based on these inputs and pass the two heads, headA and headB to your program. If you correctly return the intersected node, then your solution will be accepted.

        

        Example 1:
        Input: intersectVal = 8, listA = [4,1,8,4,5], listB = [5,6,1,8,4,5], skipA = 2, skipB = 3
        Output: Intersected at '8'
        Explanation: The intersected node's value is 8 (note that this must not be 0 if the two lists intersect).
        From the head of A, it reads as [4,1,8,4,5]. From the head of B, it reads as [5,6,1,8,4,5]. There are 2 nodes before the intersected node in A; There are 3 nodes before the intersected node in B.
        - Note that the intersected node's value is not 1 because the nodes with value 1 in A and B (2nd node in A and 3rd node in B) are different node references. In other words, they point to two different locations in memory, while the nodes with value 8 in A and B (3rd node in A and 4th node in B) point to the same location in memory.


        Example 2:
        Input: intersectVal = 2, listA = [1,9,1,2,4], listB = [3,2,4], skipA = 3, skipB = 1
        Output: Intersected at '2'
        Explanation: The intersected node's value is 2 (note that this must not be 0 if the two lists intersect).
        From the head of A, it reads as [1,9,1,2,4]. From the head of B, it reads as [3,2,4]. There are 3 nodes before the intersected node in A; There are 1 node before the intersected node in B.


        Example 3:
        Input: intersectVal = 0, listA = [2,6,4], listB = [1,5], skipA = 3, skipB = 2
        Output: No intersection
        Explanation: From the head of A, it reads as [2,6,4]. From the head of B, it reads as [1,5]. Since the two lists do not intersect, intersectVal must be 0, while skipA and skipB can be arbitrary values.
        Explanation: The two lists do not intersect, so return null.


 */



package LinkedList.SinglyLinkedList.Easy;

import java.util.Hashtable;

class ListNode{
    int val;
    ListNode next;

    ListNode(int x){
        val = x;
        next = null;
    }
}

public class IntersectionOfTwoLinkedList {

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

    static ListNode getIntersectionNodebruteForce(ListNode headA, ListNode headB) {

        ListNode node1 = headA;
        ListNode node2 = headB;

        while(node1!=null){
            while(node2!=null){
                if(node1==node2){
                    return node1;
                }
                node2 = node2.next;
            }
            node1 = node1.next;
        }
        return null;
    }

    static ListNode getIntersectionNodeBetter(ListNode headA, ListNode headB) {
        Hashtable<Integer,ListNode> hm=new Hashtable<Integer,ListNode>();
        int x = 0;
        ListNode node1 = headA;
        while(node1!=null){
            hm.put(0, node1);
            x++;
            node1= node1.next;
        }

        ListNode node2 = headB;
        while(node2!=null){
            if(hm.containsValue(node2)){
                return node2;
            }
        }
        return null;

    }

    static ListNode getIntersectionNodeOptimal(ListNode headA, ListNode headB) {
        ListNode node1 = headA;
        ListNode node2 = headB;

        while(node1!=node2){
            node1 = node1 == null? headB:node1.next;
            node2 = node2 == null? headA:node2.next;
        }
    
        return null;
    }


   
    public static void main(String[] args) {
        ListNode head = null;
        display(head);

        head = insert(head, 1);
        head = insert(head, 2);
        head= insert(head, 2);
        head = insert(head, 1);

        System.out.println("\nLinked List after insertion...!");
        display(head);

    }
}



