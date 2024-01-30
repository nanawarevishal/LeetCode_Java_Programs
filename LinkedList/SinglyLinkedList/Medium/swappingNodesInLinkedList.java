

/*

1721. Swapping Nodes in a Linked List
        Medium
        5.1K
        166
        Companies
        You are given the head of a linked list, and an integer k.

        Return the head of the linked list after swapping the values of the kth node from the beginning and the kth node from the end (the list is 1-indexed).

        

        Example 1:
        Input: head = [1,2,3,4,5], k = 2
        Output: [1,4,3,2,5].

        Example 2:
        Input: head = [7,9,6,6,7,8,3,0,9,5], k = 5
        Output: [7,9,6,6,8,7,3,0,9,5].

 */




package LinkedList.SinglyLinkedList.Medium;

import java.util.ArrayList;

class swappingNodesInLinkedList {

    static ListNode swapNodes(ListNode head, int k) {
        ArrayList<ListNode>ls = new ArrayList<>();

        ListNode temp = head;

        while(temp!=null){
            ls.add(temp);
            temp = temp.next;
        }

        int left = 0;
        int right = ls.size()-1;

        while(left<ls.size()){
            if(left+1 == k){
                ListNode t = ls.get(left);
                ls.set(left,ls.get(right));
                ls.set(right,t);
                break;
            }
            left++;
            right--;
        }

        head = null;
        temp = head;

        for(ListNode node : ls){
            ListNode newNode = node;
            newNode.next = null;

            if(temp == null){
                temp = newNode;
                head = temp;
            }

            else{
                temp.next = newNode;
                temp = newNode;
            }
        }
        return head;
    }
}
