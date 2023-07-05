

/*
 234. Palindrome Linked List
        Easy
        14.5K
        797
        Companies
        Given the head of a singly linked list, return true if it is a 
        palindrome
        or false otherwise.

        

        Example 1:
        Input: head = [1,2,2,1]
        Output: true

        Example 2:
        Input: head = [1,2]
        Output: false
 */



package LinkedList.SinglyLinkedList.Easy;

import java.util.ArrayList;
import java.util.List;

class ListNode{
    int val;
    ListNode next;

    ListNode(int x){
        val = x;
        next = null;
    }
}

public class PalindromeLinkedList {

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


    static boolean isPalindrome(ListNode head) {
        
        ListNode node = head;
        List<Integer> ls=new ArrayList<Integer>();  
        while(node!=null){
            ls.add(node.val);
            node=node.next;

        }

       Integer arr[] = ls.toArray(new Integer[0]);

       int left = 0;
       int right = arr.length-1;

       while(left<right){
            if(arr[left]!=arr[right]){
                return false;
            }
            left++;
            right--;
       }
       
        return true;
    }

   
    public static void main(String[] args) {
        ListNode head = null;
        display(head);

        head = insert(head, 1);
        head = insert(head, 2);
        // head= insert(head, 2);
        // head = insert(head, 1);

        System.out.println("\nLinked List after insertion...!");
        display(head);

        System.out.println(isPalindrome(head));



    }
}


