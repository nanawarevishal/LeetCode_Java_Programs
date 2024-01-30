
/*
2807. Insert Greatest Common Divisors in Linked List
        Medium
        411
        12
        Companies
        Given the head of a linked list head, in which each node contains an integer value.

        Between every pair of adjacent nodes, insert a new node with a value equal to the greatest common divisor of them.

        Return the linked list after insertion.

        The greatest common divisor of two numbers is the largest positive integer that evenly divides both numbers.

        

        Example 1:
        Input: head = [18,6,10,3]
        Output: [18,6,6,2,10,1,3]
        Explanation: The 1st diagram denotes the initial linked list and the 2nd diagram denotes the linked list after inserting the new nodes (nodes in blue are the inserted nodes).
        - We insert the greatest common divisor of 18 and 6 = 6 between the 1st and the 2nd nodes.
        - We insert the greatest common divisor of 6 and 10 = 2 between the 2nd and the 3rd nodes.
        - We insert the greatest common divisor of 10 and 3 = 1 between the 3rd and the 4th nodes.
        There are no more adjacent nodes, so we return the linked list.


        Example 2:
        Input: head = [7]
        Output: [7]
        Explanation: The 1st diagram denotes the initial linked list and the 2nd diagram denotes the linked list after inserting the new nodes.
        There are no pairs of adjacent nodes, so we return the initial linked list.


 */


package LinkedList.SinglyLinkedList.Medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

class InsertGCD {
    
    static ListNode insertGreatestCommonDivisors(ListNode head) {
        
        List<Integer>ls = new ArrayList<>();

        ListNode temp = head;

        while(temp!=null){
            ls.add(temp.val);
            temp = temp.next;
        }

        int left = 0;
        int right = 1;
        int size = ls.size();

        System.out.println(ls);

        HashMap<Integer,Integer>mp = new LinkedHashMap<>();

        while(right<size){
            int num = gcd(ls.get(left),ls.get(right));
            mp.put(right,num);
            left++;
            right++;
        }

        System.out.println(mp);
        int ind = 0;
        for(Map.Entry<Integer,Integer>entry: mp.entrySet()){
            ls.add(entry.getKey()+ind,entry.getValue());
            ind++;
        }

        head = null;
        temp = head;

        for(int data : ls){
            ListNode newNode = new ListNode(data);

            if(temp == null){
                temp =newNode;
                head = temp;
            }

            else{
                temp.next = newNode;
                temp = newNode;
            }
        }

        return head;
    }

    static int gcd(int a,int b){
        int min = Math.min(a,b);

        while(true){
            if(a%min ==0 && b % min ==0){
                return min;
            }
            min--;
        } 
    }

    public static void main(String[] args) {
        
    }
}
