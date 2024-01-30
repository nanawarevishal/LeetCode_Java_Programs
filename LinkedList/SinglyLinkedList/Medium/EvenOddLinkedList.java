

/*

328. Odd Even Linked List
        Medium
        9.4K
        495
        Companies
        Given the head of a singly linked list, group all the nodes with odd indices together followed by the nodes with even indices, and return the reordered list.

        The first node is considered odd, and the second node is even, and so on.

        Note that the relative order inside both the even and odd groups should remain as it was in the input.

        You must solve the problem in O(1) extra space complexity and O(n) time complexity.

        

        Example 1:
        Input: head = [1,2,3,4,5]
        Output: [1,3,5,2,4].

        Example 2:
        Input: head = [2,1,3,5,6,4,7]
        Output: [2,3,6,7,1,5,4].

 */





package LinkedList.SinglyLinkedList.Medium;

import java.util.ArrayList;

class EvenOddLinkedList {
    
    static ListNode oddEvenList(ListNode head) {
        
        ArrayList<Integer>odd = new ArrayList<>();
        ArrayList<Integer>even = new ArrayList<>();

        ListNode temp = head;
        int i = 1;

        while(temp!=null){
            if(i%2==1){
                odd.add(temp.val);
            }
            else{
                even.add(temp.val);
            }
            i++;
            temp = temp.next;
        }

        head = null;
        temp = head;
        for(int data : odd){
            ListNode newNode = new ListNode(data);

            if(temp == null){
                temp = newNode;
                head = temp;
            }
            else{
                temp.next = newNode;
                temp = newNode;
            }
        }

         for(int data : even){
            ListNode newNode = new ListNode(data);

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
