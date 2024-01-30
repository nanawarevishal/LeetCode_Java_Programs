

/*

1669. Merge In Between Linked Lists
        Medium
        1.5K
        184
        Companies
        You are given two linked lists: list1 and list2 of sizes n and m respectively.

        Remove list1's nodes from the ath node to the bth node, and put list2 in their place.

        The blue edges and nodes in the following figure indicate the result:


        Build the result list and return its head.

        

        Example 1:


        Input: list1 = [0,1,2,3,4,5], a = 3, b = 4, list2 = [1000000,1000001,1000002]
        Output: [0,1,2,1000000,1000001,1000002,5]
        Explanation: We remove the nodes 3 and 4 and put the entire list2 in their place. The blue edges and nodes in the above figure indicate the result.
        Example 2:


        Input: list1 = [0,1,2,3,4,5,6], a = 2, b = 5, list2 = [1000000,1000001,1000002,1000003,1000004]
        Output: [0,1,1000000,1000001,1000002,1000003,1000004,6]
        Explanation: The blue edges and nodes in the above figure indicate the result.

 */




package LinkedList.SinglyLinkedList.Medium;

class MergeInBetweenLinkedList {

    static ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        
        int count = 0;
        ListNode temp1 = null,temp2=null,temp = list1;

        while(temp!=null){

            if(count+1 == a){
                temp1 = temp;
            }
            else if(count == b){
                temp2 = temp.next;
                break;
            }
            count++;
            temp = temp.next;
        }

        
        temp = list2;
        ListNode head = null;

        while(temp.next!=null){
            temp = temp.next;
        }

        if(a==0){
            head = list2;
            temp.next = temp2;
        }

        else{
            head = list1;
            temp1.next = list2;
            temp.next = temp2;
        }

        return head;
    }
}
